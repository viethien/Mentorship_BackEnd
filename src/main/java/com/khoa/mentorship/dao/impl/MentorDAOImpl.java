package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.khoa.mentorship.dao.MentorDAO;
import com.khoa.mentorship.entity.Mentor;

public class MentorDAOImpl implements MentorDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Mentor getMentorByEmail(String email) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Mentor where email = :email");
		query.setParameter("email", email);
		if(query.getResultList().size() > 0) {
			return (Mentor) query.getResultList().get(0);
		}
		return null;
	}

}
