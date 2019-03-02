package com.khoa.mentorship.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khoa.mentorship.dao.TitleDAO;
import com.khoa.mentorship.entity.Title;

@Repository
public class TitleDAOImpl implements TitleDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Title getTitleById(int titleId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Title where titleId = :titleId");
		query.setParameter("titleId", titleId);
		if(query.getResultList().size() > 0) {
			return (Title) query.getResultList().get(0);
		}
		return null;
	}

}
