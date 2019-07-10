package com.whr.bean;

public class User {
	private String name;
	private String password;
	private String nickname;
	private String sex;
	private String hobby;
	private String path;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password, String nickname, String sex, String hobby, String path) {
		super();
		this.name = name;
		this.password = password;
		this.nickname = nickname;
		this.sex = sex;
		this.hobby = hobby;
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", nickname=" + nickname + ", sex=" + sex + ", hobby="
				+ hobby + ", path=" + path + "]";
	}
	
	
}
