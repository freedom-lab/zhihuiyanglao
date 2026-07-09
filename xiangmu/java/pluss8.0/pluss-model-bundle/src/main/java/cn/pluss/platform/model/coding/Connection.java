package cn.pluss.platform.model.coding;
/**
 * 
 * @author liys
 * 2016-4-22 17:35
 *
 */
public class Connection {

	private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getWebStyle() {
		return webStyle;
	}

	public void setWebStyle(String webStyle) {
		this.webStyle = webStyle;
	}

	private  String port;
	private  String name;
	private  String userName;
	private  String password;
	private  String dbType;
	private  String webStyle;

	public Connection(String ip, String port, String name, String userName, String password, String dbType, String webStyle) {
		this.ip = ip;
		this.port = port;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.dbType = dbType;
		this.webStyle = webStyle;
	}
}
