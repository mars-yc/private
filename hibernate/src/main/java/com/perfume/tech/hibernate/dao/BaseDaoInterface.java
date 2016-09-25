package com.perfume.tech.hibernate.dao;

import java.util.Set;

import com.perfume.tech.hibernate.utils.HibernateUtils;

public interface BaseDaoInterface<T> {
	
	void save(T t);
	
	void delete(T t);
	
	void update(T t);
	
	Set<T> loadAll();
	
	void setHibernateUtils(HibernateUtils hibernateUtils);

}
