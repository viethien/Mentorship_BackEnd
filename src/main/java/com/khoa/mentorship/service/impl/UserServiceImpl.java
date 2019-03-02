package com.khoa.mentorship.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.mentorship.dao.UserDAO;
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

}
