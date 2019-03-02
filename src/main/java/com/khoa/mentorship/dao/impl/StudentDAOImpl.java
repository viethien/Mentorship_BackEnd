package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.khoa.mentorship.dao.StudentDAO;
import com.khoa.mentorship.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Student getStudentByEmail(String email) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Student where email = :email");
		query.setParameter("email", email);
		if(query.getResultList().size() > 0) {
			return (Student) query.getResultList().get(0);
		}
		return null;
	}

}
