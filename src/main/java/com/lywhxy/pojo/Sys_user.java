package com.lywhxy.pojo;

public class Sys_user {
	int user_id;//uId
	String user_code;
	String user_name;
	String user_password;
	int user_state;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getUser_state() {
		return user_state;
	}

	public void setUser_state(int user_state) {
		this.user_state = user_state;
	}

	@Override
	public String toString() {
		return "Sys_user{" +
				"user_id=" + user_id +
				", user_code='" + user_code + '\'' +
				", user_name='" + user_name + '\'' +
				", user_password='" + user_password + '\'' +
				", user_state=" + user_state +
				'}';
	}
}
