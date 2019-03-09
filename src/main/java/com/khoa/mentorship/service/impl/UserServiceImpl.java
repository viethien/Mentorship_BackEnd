package com.khoa.mentorship.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.mentorship.dao.UserDAO;
import com.khoa.mentorship.model.LoginModel;
import com.khoa.mentorship.model.LoginResponseModel;
import com.khoa.mentorship.model.UserDetailModel;
import com.khoa.mentorship.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public boolean updateDetails(UserDetailModel userDetailModel) {
		return userDAO.updateDetails(userDetailModel);
	}

	@Override
	@Transactional
	public boolean activateAcccount(String email) {
		return userDAO.activateAcccount(email);
	}

	@Override
	public LoginResponseModel login(LoginModel loginModel) {
		return userDAO.login(loginModel);
	}

}
