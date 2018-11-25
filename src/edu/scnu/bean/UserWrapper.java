package edu.scnu.bean;

import java.io.Serializable;

public class UserWrapper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private Integer[] ids;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserWrapper(User user) {
		this.user = user;
	}
	
	

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public UserWrapper() {
	}

	public UserWrapper(Integer[] ids) {
		this.ids = ids;
	}
}
