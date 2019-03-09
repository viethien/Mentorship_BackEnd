package com.khoa.mentorship.model;

public class LoginResponseModel {
	
	public boolean successful;
	
	public String userType;

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
