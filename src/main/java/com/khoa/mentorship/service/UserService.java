package com.khoa.mentorship.service;

import com.khoa.mentorship.model.LoginModel;
import com.khoa.mentorship.model.UserDetailModel;

public interface UserService {
	
	public boolean updateDetails(UserDetailModel userDetailModel);
	
	public boolean activateAcccount(String email);
	
	public boolean login(LoginModel loginModel);

}
