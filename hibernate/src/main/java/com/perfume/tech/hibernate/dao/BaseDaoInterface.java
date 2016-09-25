package com.perfume.tech.hibernate.dao;

import java.util.Set;

public interface BaseDaoInterface<T> {
	
	void save(T t);
	
	void delete(T t);
	
	void update(T t);
	
	Set<T> loadAll();

}
