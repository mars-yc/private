package com.perfume.tech.hibernate.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.perfume.tech.hibernate.dao.BaseDaoInterface;
import com.perfume.tech.hibernate.utils.HibernateUtils;

public abstract class AbstractBaseDao<T> implements BaseDaoInterface<T> {
	
	protected HibernateUtils hibernateUtils;
	
	public void setHibernateUtils(HibernateUtils hibernateUtils) {
		this.hibernateUtils = hibernateUtils;
	}

	@Override
	public final void save(T t) {
		Session session = hibernateUtils.getSession();
		session.beginTransaction();
		try {
			session.save(t);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			hibernateUtils.closeSession();
		}
	}

	@Override
	public final void delete(T t) {
		Session session = hibernateUtils.getSession();
		session.beginTransaction();
		try {
			session.delete(t);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			hibernateUtils.closeSession();
		}
	}

	@Override
	public final void update(T t) {
		Session session = hibernateUtils.getSession();
		session.beginTransaction();
		try {
			session.update(t);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			hibernateUtils.closeSession();
		}
	}

	@SuppressWarnings("unchecked")
	public Set<T> loadAll(Class<T> c) {
		String hql = "from " + ((Class<?>) c).getSimpleName();
		Session session = hibernateUtils.getSession();
		List<T> list = session.createQuery(hql).list();
		hibernateUtils.closeSession();
		return new HashSet<T>(list);
	}

}
