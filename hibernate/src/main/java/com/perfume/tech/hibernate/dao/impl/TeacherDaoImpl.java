package com.perfume.tech.hibernate.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.perfume.tech.hibernate.dao.TeacherDao;
import com.perfume.tech.hibernate.pojo.Teacher;

public class TeacherDaoImpl extends AbstractBaseDao<Teacher> implements TeacherDao {
	
	private static final String HQL_FIND_TEACHER_BY_NAME = "from Teacher where name = :name";

	@Override
	public Set<Teacher> loadAll() {
		return loadAll(Teacher.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<Teacher> findByName(String name) {
		Session session = hibernateUtils.getSession();
		List<Teacher> list = (List<Teacher>) session.createQuery(HQL_FIND_TEACHER_BY_NAME).setParameter("name", name).list();
		hibernateUtils.closeSession();
		return new HashSet<>(list);
	}

}
