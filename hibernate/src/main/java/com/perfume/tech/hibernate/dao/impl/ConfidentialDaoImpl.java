package com.perfume.tech.hibernate.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.perfume.tech.hibernate.dao.ConfidentialDao;
import com.perfume.tech.hibernate.pojo.Confidential;

public class ConfidentialDaoImpl extends AbstractBaseDao<Confidential> implements ConfidentialDao {
	
	private static final String HQL_GET_CONFIDENTIAL_BY_USERNAME = "from Credential where username = :username";

	@SuppressWarnings("unchecked")
	@Override
	public Confidential getConfidentialByUserName(String username) {
		Session session = hibernateUtils.getSession();
		List<Confidential> list = (List<Confidential>) session.createQuery(HQL_GET_CONFIDENTIAL_BY_USERNAME).setParameter("name", username).list();
		hibernateUtils.closeSession();
		return list.get(0);
	}

	@Override
	public Set<Confidential> loadAll() {
		return loadAll(Confidential.class);
	}
	
}
