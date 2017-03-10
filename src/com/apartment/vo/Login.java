package com.apartment.vo;

import org.hibernate.validator.NotEmpty;

public class Login {
	
	@NotEmpty
	private String loginName;
	
	@NotEmpty
	private String password;
	private String tenantId;	
	private String adminId;	
	private String role;
	
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}	
	
	@Override
	public String toString() {
		return "Login [loginName=" + loginName + ", password=" + password
				+ ", tenantId=" + tenantId + ", adminId=" + adminId + ", role="
				+ role + "]";
	}
	

}
