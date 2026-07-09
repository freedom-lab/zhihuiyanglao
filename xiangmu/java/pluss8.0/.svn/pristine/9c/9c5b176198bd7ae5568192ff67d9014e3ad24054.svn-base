package cn.pluss.platform.util;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * 主机A向主机B发送“UDP－NetBIOS－NS”询问包，即向主机B的137端口，发Query包来询问主机B的NetBIOS Names信息。 
 * 其次，主机B接收到“UDP－NetBIOS－NS”询问包，假设主机B正确安装了NetBIOS服务........... 而且137端口开放，则主机B会向主机A发送一个“UDP－NetBIOS－NS”应答包，即发Answer包给主机A。 
 * 并利用UDP(NetBIOS Name Service)来快速获取远程主机MAC地址的方法 
 *  
 */  
public class IpUtil {
	
	public static String getIp(HttpServletRequest request){
	    String ip = request.getHeader("X-Forwarded-For");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            int index = ip.indexOf(",");
	            if (index != -1) {
	                return ip.substring(0, index);
	            } else {
	                return ip;
	            }
	        }
	    }
	    ip = request.getHeader("X-Real-IP");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    ip = request.getHeader("Proxy-Client-IP");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    ip = request.getHeader("WL-Proxy-Client-IP");
	    if (ip != null) {
	        if (!ip.isEmpty() && !"unKnown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    ip =  request.getRemoteAddr();
	    return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
	}


	/**
	 * 根据公网ip获取归属地
	 * @param publicIP
	 * @return
	 */
	public static String getAddressByPublicIP(String publicIP) {
		String url = "http://whois.pconline.com.cn/ipJson.jsp?ip=" + publicIP + "&json=true";
		HttpResult httpResult = null;
		try {
			httpResult = HttpUtil.doGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!StringUtil.isEmpty(httpResult.getBody())){
			String substring = httpResult.getBody().substring(httpResult.getBody().indexOf("{"), httpResult.getBody().indexOf("}")+1);
			JSONObject jsonObject = JSONObject.parseObject(substring);
			String province = jsonObject.getString("pro");
			String city = jsonObject.getString("city");
			return  province + " " + city;
		}
		return null;
	}
	public static String getMacAddrByIp(String ip) {
	    String macAddr = null;
	    try {
	        Process process = Runtime.getRuntime().exec("nbtstat -a " + ip);
	        BufferedReader br = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));
	        Pattern pattern = Pattern.compile("([A-F0-9]{2}-){5}[A-F0-9]{2}");
	        Matcher matcher;
	        for (String strLine = br.readLine(); strLine != null;
	             strLine = br.readLine()) {
	            matcher = pattern.matcher(strLine);
	            if (matcher.find()) {
	                macAddr = matcher.group();
	                break;
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return macAddr;
	}
	
    public static String getMacInLinux(final String ip) {
        String result = "";
        String[] cmd = { "/bin/sh", "-c", "ping " + ip + " -c 2 && arp -a" };
        String cmdResult = callCmd(cmd);
        result = filterMacAddress(ip, cmdResult, ":");
        return result;
    }
    
    public static String callCmd(String[] cmd) {
        String result = "";
        String line = "";
        Process proc;
        try {
            proc = Runtime.getRuntime().exec(cmd);
            InputStreamReader is = new InputStreamReader(proc.getInputStream());
            BufferedReader br = new BufferedReader(is);
            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
    *
    *
    *
    * @param ip
    *            目标ip,一般在局域网内
    *
    * @param sourceString
    *            命令处理的结果字符串
    *
    * @param macSeparator
    *            mac分隔符号
    *
    * @return mac地址，用上面的分隔符号表示
    *
    */

   public static String filterMacAddress(final String ip,
           final String sourceString, final String macSeparator) {
       String result = "";
       String regExp = "((([0-9,A-F,a-f]{1,2}" + macSeparator
               + "){1,5})[0-9,A-F,a-f]{1,2})";
       Pattern pattern = Pattern.compile(regExp);
       Matcher matcher = pattern.matcher(sourceString);
       while (matcher.find()) {
           result = matcher.group(1);
           if (sourceString.indexOf(ip) <= sourceString.lastIndexOf(matcher
                   .group(1))) {
               break; // 如果有多个IP,只匹配本IP对应的Mac.
           }
       }
       return result;
   }
	/**
	 *
	 * @param ip
	 *            服务器端请求编码。如GBK,UTF-8等
	 * @return
	 */
	public static String getAddresses(String ip){
		// 这里调用淘宝API
		String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
		// 从http://whois.pconline.com.cn取得IP所在的省市区信息
		String encodingString="utf-8";
		String returnStr = getResult(urlStr, "ip="+ip, encodingString);
		if (returnStr != null) {
			// 处理返回的省市区信息
			System.out.println("(1) unicode转换成中文前的returnStr : " + returnStr);
			returnStr = decodeUnicode(returnStr);
			System.out.println("(2) unicode转换成中文后的returnStr : " + returnStr);
			String[] temp = returnStr.split(",");
			if(temp.length<3){
				return "0";//无效IP，局域网测试
			}
			return returnStr;
		}
		return null;
	}
	/**
	 * @param urlStr
	 *            请求的地址
	 * @param content
	 *            请求的参数 格式为：name=xxx&pwd=xxx
	 * @param encoding
	 *            服务器端请求编码。如GBK,UTF-8等
	 * @return
	 */
	private static String getResult(String urlStr, String content, String encoding) {
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫秒
			connection.setReadTimeout(2000);// 设置读取数据超时时间，单位毫秒
			connection.setDoOutput(true);// 是否打开输出流 true|false
			connection.setDoInput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection
					.getOutputStream());// 打开输出流往对端服务器写数据
			out.writeBytes(content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
			out.flush();// 刷新
			out.close();// 关闭输出流
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据
			// ,以BufferedReader流来读取
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			return buffer.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();// 关闭连接
			}
		}
		return null;
	}
	/**
	 * unicode 转换成 中文
	 *
	 * @author fanhui 2007-3-15
	 * @param theString
	 * @return
	 */
	public static String decodeUnicode(String theString) {
		char aChar;
		int len = theString.length();
		StringBuffer outBuffer = new StringBuffer(len);
		for (int x = 0; x < len;) {
			aChar = theString.charAt(x++);
			if (aChar == '\\') {
				aChar = theString.charAt(x++);
				if (aChar == 'u') {
					int value = 0;
					for (int i = 0; i < 4; i++) {
						aChar = theString.charAt(x++);
						switch (aChar) {
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
								value = (value << 4) + aChar - '0';
								break;
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
								value = (value << 4) + 10 + aChar - 'a';
								break;
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
								value = (value << 4) + 10 + aChar - 'A';
								break;
							default:
								throw new IllegalArgumentException(
										"Malformed      encoding.");
						}
					}
					outBuffer.append((char) value);
				} else {
					if (aChar == 't') {
						aChar = '\t';
					} else if (aChar == 'r') {
						aChar = '\r';
					} else if (aChar == 'n') {
						aChar = '\n';
					} else if (aChar == 'f') {
						aChar = '\f';
					}
					outBuffer.append(aChar);
				}
			} else {
				outBuffer.append(aChar);
			}
		}
		return outBuffer.toString();
	}

	/**
	 * 根据ip获取归属地
	 * @param ip
	 * @return
	 */
	public static String getAddress(String ip) {
		String url = "http://ip.ws.126.net/ipquery?ip=" + ip;
		HttpResult httpResult = null;
		try {
			httpResult = HttpUtil.doGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!StringUtil.isEmpty(httpResult.getBody())){
			String substring = httpResult.getBody().substring(httpResult.getBody().indexOf("{"), httpResult.getBody().indexOf("}")+1);
			JSONObject jsonObject = JSONObject.parseObject(substring);
			String province = jsonObject.getString("province");
			String city = jsonObject.getString("city");
			return  province + " " + city;
		}
		return null;
	}


}