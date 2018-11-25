package edu.scnu.bean;

import java.io.Serializable;

public class UserWrapper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserWrapper(User user) {
		this.user = user;
	}

	public UserWrapper() {
	}
	
	
}
