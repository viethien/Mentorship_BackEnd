package com.khoa.mentorship.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.mentorship.dao.RegisterDAO;
import com.khoa.mentorship.model.RegisterModel;
import com.khoa.mentorship.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterDAO registerDAO;

	@Override
	@Transactional
	public boolean registerUser(RegisterModel registerModel) {
		return registerDAO.registerUser(registerModel);
	}

}
