package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.UserDAO;
import com.khoa.mentorship.model.UserDetailModel;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public boolean updateDetails(UserDetailModel userDetailModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
