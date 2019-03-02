package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.HighschoolDAO;
import com.khoa.mentorship.entity.Highschool;

@Repository
public class HighschoolDAOImpl implements HighschoolDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Highschool getHighschoolById(int highschoolId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Highschool where highschoolId = :highschoolId");
		query.setParameter("highschoolId", highschoolId);
		if(query.getResultList().size() > 0) {
			return (Highschool) query.getResultList().get(0);
		}
		return null;
	}

}
