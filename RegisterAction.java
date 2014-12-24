package com.test.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.test.ssh.froms.UserFrom;
import com.test.ssh.service.UserManager;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserFrom user;
	private UserManager userManager;
	public UserFrom getUser() {
		return user;
	}
	public void setUser(UserFrom user) {
		this.user = user;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public String execute(){
		
		try {
//			this.setUserManager(new UserManagerImpl());
			userManager.regUser(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
			
		}
	}

}
