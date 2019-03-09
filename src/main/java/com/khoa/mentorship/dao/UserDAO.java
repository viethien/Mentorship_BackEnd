package com.khoa.mentorship.dao;

import com.khoa.mentorship.model.LoginModel;
import com.khoa.mentorship.model.LoginResponseModel;
import com.khoa.mentorship.model.UserDetailModel;

public interface UserDAO {
	
	public boolean updateDetails(UserDetailModel userDetailModel);
	
	public boolean activateAcccount(String email);
	
	public LoginResponseModel login(LoginModel loginModel);

}
