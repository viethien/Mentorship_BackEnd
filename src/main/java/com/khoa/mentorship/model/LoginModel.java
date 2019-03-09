package com.khoa.mentorship.model;

public class LoginModel {
	
	private String email;
	private String password;
	private boolean mentor;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMentor() {
		return mentor;
	}
	public void setMentor(boolean mentor) {
		this.mentor = mentor;
	}
	
}
