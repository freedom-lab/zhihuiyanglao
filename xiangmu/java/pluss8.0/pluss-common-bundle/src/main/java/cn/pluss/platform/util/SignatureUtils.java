package cn.pluss.platform.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

/**
 * 服务端API签名工具类
 */
public class SignatureUtils {

    private final static String CHARSET_UTF8 = "utf8";
    private final static String ALGORITHM = "HmacSHA1";
    private final static String SEPARATOR = "&";

    public static Map<String, String> splitQueryString(String url) throws URISyntaxException, UnsupportedEncodingException {
        URI uri = new URI(url);
        String query = uri.getQuery();
        final String[] pairs = query.split("&");
        TreeMap<String, String> queryMap = new TreeMap<String, String>();
        for (String pair : pairs) {
            final int idx = pair.indexOf("=");
            final String key = idx > 0 ? pair.substring(0, idx) : pair;
            if (!queryMap.containsKey(key)) {
                queryMap.put(key, URLDecoder.decode(pair.substring(idx + 1), CHARSET_UTF8));
            }
        }
        return queryMap;
    }

    public static String generate(String method, String path, Map<String, Object> parameter, String clientSecret) throws Exception {
        String signString = generateSignString(method, path, parameter);
        //System.out.println("--- Signature String ---" + signString);
        byte[] signBytes = hmacSHA1Signature(clientSecret + "&", signString);
        String signature = newStringByBase64(signBytes);
        //System.out.println("--- Signature Base64 ---" + signature);
        //System.out.println("--- Signature Encode ---" + URLEncoder.encode(signature, "UTF-8"));
        if ("POST".equals(method)){
            return signature;
        }
        return URLEncoder.encode(signature, "UTF-8");
    }

    private static String generateSignString(String method, String path, Map<String, Object> parameter) throws IOException {
        TreeMap<String, Object> sortParameter = new TreeMap<String, Object>();
        sortParameter.putAll(parameter);
        String canonicalizedQueryString = generateQueryString(sortParameter, true);
        if (null == method) {
            throw new RuntimeException("method can not be empty");
        }
        if (null == path) {
            throw new RuntimeException("path can not be empty");
        }
        if (null == parameter) {
            throw new RuntimeException("parameter can not be empty");
        }
        StringBuilder stringToSign = new StringBuilder();
        stringToSign.append(method).append(SEPARATOR);
        stringToSign.append(percentEncode(path)).append(SEPARATOR);
        stringToSign.append(percentEncode(canonicalizedQueryString));
        return stringToSign.toString();
    }

    public static String percentEncode(String value) throws UnsupportedEncodingException {
        // 使用URLEncoder.encode编码后，将"+","*","%7E"做替换即满足API规定的编码规范。
        return value == null ? null : URLEncoder
                .encode(value, CHARSET_UTF8)
                .replace("+", "%20")
                .replace("*", "%2A")
                .replace("%7E",
                        "~");
    }

    public static byte[] hmacSHA1Signature(String secret, String baseString) throws Exception {
        if (StringUtils.isEmpty(secret)) {
            throw new IOException("secret can not be empty");
        }
        if (StringUtils.isEmpty(baseString)) {
            return null;
        }
        Mac mac = Mac.getInstance("HmacSHA1");
        SecretKeySpec keySpec = new SecretKeySpec(secret.getBytes(CHARSET_UTF8), ALGORITHM);
        mac.init(keySpec);
        return mac.doFinal(baseString.getBytes(CHARSET_UTF8));
    }

    public static String newStringByBase64(byte[] bytes) throws UnsupportedEncodingException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return new String(Base64.encodeBase64(bytes, false), CHARSET_UTF8);
    }

    public static String generateQueryString(Map<String, Object> params, boolean isEncodeKV) throws UnsupportedEncodingException {
        StringBuilder canonicalizedQueryString = new StringBuilder();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (isEncodeKV)
                canonicalizedQueryString.append(percentEncode(entry.getKey())).append("=").append(percentEncode(String.valueOf(entry.getValue()))).append("&");
            else
                canonicalizedQueryString.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        if (canonicalizedQueryString.length() > 1) {
            canonicalizedQueryString.setLength(canonicalizedQueryString.length() - 1);
        }
        return canonicalizedQueryString.toString();
    }

}
