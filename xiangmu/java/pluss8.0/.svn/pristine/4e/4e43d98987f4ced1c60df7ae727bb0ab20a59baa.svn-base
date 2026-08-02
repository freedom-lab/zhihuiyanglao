package cn.pluss.platform.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class HttpUtil {
	
	
//	private static CloseableHttpClient httpClient;
//	
//	 public void APIService() {
//	        // 1 创建HttpClinet，相当于打开浏览器
//	        this.httpClient = HttpClients.createDefault();
//	 }
	private static final Logger logger = Logger.getLogger(HttpUtil.class);

	 /**
     * 带参数的get请求
     * 
     * @param url
     * @param map
     * @return
     * @throws Exception
     */
    public static HttpResult doGet(String url, Map<String, Object> map)  {

        // 声明URIBuilder
        URIBuilder uriBuilder=null;
        HttpResult httpResult=null;
		try {
			uriBuilder = new URIBuilder(url);

	        // 判断参数map是否为非空
	        if (map != null) {
	            // 遍历参数
	            for (Map.Entry<String, Object> entry : map.entrySet()) {
	                // 设置参数
	                uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
	            }
	        }

	        // 2 创建httpGet对象，相当于设置url请求地址
	        HttpGet httpGet = new HttpGet(uriBuilder.build());
	        //
	        httpGet.addHeader("Authorization", getHeader());

	        // 3 使用HttpClient执行httpGet，相当于按回车，发起请求
	        
	        CloseableHttpClient httpClient= HttpClients.createDefault();
	        CloseableHttpResponse response = httpClient.execute(httpGet);

	        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
	        // 状态码
	        // response.getStatusLine().getStatusCode();
	        // 响应体，字符串，如果response.getEntity()为空，下面这个代码会报错,所以解析之前要做非空的判断
	        // EntityUtils.toString(response.getEntity(), "UTF-8");

	        // 解析数据封装HttpResult
	        if (response.getEntity() != null) {
	        	
	            httpResult = new HttpResult(response.getStatusLine().getStatusCode(),
	                    EntityUtils.toString(response.getEntity(), "UTF-8"));
	        } else {
	            httpResult = new HttpResult(response.getStatusLine().getStatusCode(), "");
	        }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 返回
        return httpResult;
    }

    /**
     * 不带参数的get请求
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public static HttpResult doGet(String url) throws Exception {
        HttpResult httpResult = doGet(url, null);
        return httpResult;
    }

    /**
     * 带参数的post请求
     * 
     * @param url
     * @param map
     * @return
     * @throws Exception
     */
    public static HttpResult doPost(String url, Map<String, Object> map) throws Exception {
        // 声明httpPost请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
        httpPost.addHeader("Authorization", getHeader());
        // 判断map不为空
        if (map != null) {
            // 声明存放参数的List集合
            List<NameValuePair> params = new ArrayList<NameValuePair>();

            // 遍历map，设置参数到list中
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }

            // 创建form表单对象
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, "UTF-8");

            // 把表单对象设置到httpPost中
            httpPost.setEntity(formEntity);
        }

        // 使用HttpClient发起请求，返回response
        CloseableHttpClient httpClient= HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpPost);

        // 解析response封装返回对象httpResult
        HttpResult httpResult = null;
        if (response.getEntity() != null) {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity(), "UTF-8"));
        } else {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(), "");
        }

        // 返回结果
        return httpResult;
    }

    /**
     * 不带参数的post请求
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public static HttpResult doPost(String url) throws Exception {
        HttpResult httpResult = doPost(url, null);
        return httpResult;
    }

    /**
     * 带参数的Put请求
     * 
     * @param url
     * @param map
     * @return
     * @throws Exception
     */
    public HttpResult doPut(String url, Map<String, Object> map) throws Exception {
        // 声明httpPost请求
        HttpPut httpPut = new HttpPut(url);

        // 判断map不为空
        if (map != null) {
            // 声明存放参数的List集合
            List<NameValuePair> params = new ArrayList<NameValuePair>();

            // 遍历map，设置参数到list中
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                params.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }

            // 创建form表单对象
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, "UTF-8");

            // 把表单对象设置到httpPost中
            httpPut.setEntity(formEntity);
        }

        // 使用HttpClient发起请求，返回response
        CloseableHttpClient httpClient= HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpPut);

        // 解析response封装返回对象httpResult
        HttpResult httpResult = null;
        if (response.getEntity() != null) {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity(), "UTF-8"));
        } else {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(), "");
        }

        // 返回结果
        return httpResult;
    }

    /**
     * 带参数的Delete请求
     * 
     * @param url
     * @param map
     * @return
     * @throws Exception
     */
    public HttpResult doDelete(String url, Map<String, Object> map) throws Exception {

        // 声明URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);

        // 判断参数map是否为非空
        if (map != null) {
            // 遍历参数
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // 设置参数
                uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
            }
        }

        // 2 创建httpGet对象，相当于设置url请求地址
        HttpDelete httpDelete = new HttpDelete(uriBuilder.build());

        // 3 使用HttpClient执行httpGet，相当于按回车，发起请求
        CloseableHttpClient httpClient= HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpDelete);

        // 4 解析结果，封装返回对象httpResult，相当于显示相应的结果
        // 状态码
        // response.getStatusLine().getStatusCode();
        // 响应体，字符串，如果response.getEntity()为空，下面这个代码会报错,所以解析之前要做非空的判断
        // EntityUtils.toString(response.getEntity(), "UTF-8");
        HttpResult httpResult = null;
        // 解析数据封装HttpResult
        if (response.getEntity() != null) {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity(), "UTF-8"));
        } else {
            httpResult = new HttpResult(response.getStatusLine().getStatusCode(), "");
        }

        // 返回
        return httpResult;
    }

	public static String httpPostWithJson(String url, String json) {
		String returnValue = "接口调用失败";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try{
			//第一步：创建HttpClient对象
		 httpClient = HttpClients.createDefault();
		 	
		 	//第二步：创建httpPost对象
	        HttpPost httpPost = new HttpPost(url);
	        
	        //第三步：给httpPost设置JSON格式的参数
	        StringEntity requestEntity = new StringEntity(json,"utf-8");
	        requestEntity.setContentEncoding("UTF-8");    	        
	        httpPost.setHeader("Content-type", "application/json");
	        httpPost.setEntity(requestEntity);
	       
	       //第四步：发送HttpPost请求，获取返回值
	       returnValue = httpClient.execute(httpPost,responseHandler); //调接口获取返回值时，必须用此方法
	      
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		finally {
	       try {
			httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
		 //第五步：处理返回值
	     return returnValue;
	}

	
	
	
	
	
	 public static String sendPost(String url, String param) {
	        PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        try {
	            URL realUrl = new URL(url);
	            // 打开和URL之间的连接
	            URLConnection conn = realUrl.openConnection();
	            // 设置通用的请求属性
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            // 发送POST请求必须设置如下两行
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            // 获取URLConnection对象对应的输出流
	            out = new PrintWriter(conn.getOutputStream());
	            // 发送请求参数
	            out.print(param);
	            // flush输出流的缓冲
	            out.flush();
	            // 定义BufferedReader输入流来读取URL的响应
	            in = new BufferedReader(
	                    new InputStreamReader(conn.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("发送 POST 请求出现异常！"+e);
	            e.printStackTrace();
	        }
	        //使用finally块来关闭输出流、输入流
	        finally{
	            try{
	                if(out!=null){
	                    out.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(IOException ex){
	                ex.printStackTrace();
	            }
	        }
	        return result;
	    }    
	 
		
		 /**
		         * 构造Basic Auth认证头信息
		* 
		* @return
		*/
		public static String getHeader() {
			String auth ="pluss:123456" ;
			byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
			String authHeader = "Basic " + new String(encodedAuth);
			return authHeader;
		}
		
		/**
		 * post请求（用于请求json格式的参数）
		 * @param url
		 * @param params
		 * @return
		 */
		public static String doPostJson(String url, String params) throws Exception {
			
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);// 创建httpPost   
	    	httpPost.setHeader("Accept", "application/json"); 
	    	httpPost.setHeader("Content-Type", "application/json");
	    	String charSet = "UTF-8";
	    	StringEntity entity = new StringEntity(params, charSet);
	    	httpPost.setEntity(entity);        
	        CloseableHttpResponse response = null;
	        
	        try {
	        	
	        	response = httpclient.execute(httpPost);
	            StatusLine status = response.getStatusLine();
	            int state = status.getStatusCode();
	            if (state == HttpStatus.SC_OK) {
	            	HttpEntity responseEntity = response.getEntity();
	            	String jsonString = EntityUtils.toString(responseEntity);
	            	return jsonString;
	            }
	            else{
					 System.out.println("请求返回:"+state+"("+url+")");
				}
	        }
	        finally {
	            if (response != null) {
	                try {
	                    response.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	        return null;
		}

	/**
	 * 获取接口访问令牌
	 * @param baseUrl 设备平台基础地址，
	 * @param clientId 客户端ID
	 * @param clientSecret 客户端密钥
	 * @return 响应体JSON字符串，包含 access_token、token_type、expires_time，失败返回 null
	 */
	public static String getToken(String baseUrl, String clientId, String clientSecret) {
		String url = baseUrl + "/token/get";
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("client_id", clientId);
			params.put("client_secret", clientSecret);

			HttpResult result = HttpUtil.doGet(url, params);
			if (result != null && result.getCode() == 200) {
				String body = result.getBody();
				logger.info("获取Token响应: " + body);
				return JSON.parseObject(body).getString("access_token");
			} else {
				logger.error("获取Token失败, code=" + (result != null ? result.getCode() : "null"));
			}
		} catch (Exception e) {
			logger.error("获取Token异常: " + e.getMessage(), e);
		}
		return null;
	}


	/**
	 * 带 Authorization 头的 POST JSON 请求
	 * @param url 请求地址
	 * @param jsonParams JSON格式请求体
	 * @param authorizationHeader Authorization头值，如 "Bearer xxxxx"
	 * @return 响应体字符串
	 */
	public static String doPostJsonWithToken(String url, String jsonParams, String authorizationHeader, String clientSecret) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			httpPost.setHeader("Accept", "application/json");
			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setHeader("Authorization", "Bearer "+authorizationHeader);
			JSONObject httpData = JSONObject.parseObject(jsonParams, Feature.OrderedField);
			String sign = SignatureUtils.generate("POST", "", httpData.getInnerMap(), clientSecret);
			httpData.put("sign", sign);
			StringEntity entity = new StringEntity(httpData.toJSONString(), "UTF-8");
			httpPost.setEntity(entity);

			CloseableHttpResponse response = httpClient.execute(httpPost);
			if (response.getEntity() != null) {
				return EntityUtils.toString(response.getEntity(), "UTF-8");
			}
		} catch (Exception e) {
			logger.error("POST请求异常: " + e.getMessage(), e);
		}
		return null;
	}
		/**
		 * 调试方法
		 * @param args
		 */
		public static void main(String[] args) {
			
			String  url="http://127.0.0.1:8082/systemConfig";
			 Map<String, Object> map=new HashMap<String, Object>();
			 map.put("page", 0);
			 map.put("size", 0);
			 HttpResult http=HttpUtil.doGet(url, map);
			 System.out.println("code="+http.getCode()+",body="+http.getBody());
			
			
		}
}
