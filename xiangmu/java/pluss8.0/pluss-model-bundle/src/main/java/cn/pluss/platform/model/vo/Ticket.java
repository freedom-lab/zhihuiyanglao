package cn.pluss.platform.model.vo;

import java.util.Date;

public class Ticket {

	private String ticket;
	private Date genDate;
	private String loginName;
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public Date getGenDate() {
		return genDate;
	}
	public void setGenDate(Date genDate) {
		this.genDate = genDate;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	
}
