package com.github.klauswk.mbean;

import javax.inject.Named;

@Named
public class HelloManageBean {
		
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
