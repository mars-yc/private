package com.perfume.tech.hibernate.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.perfume.tech.hibernate.dao.StudentDao;
import com.perfume.tech.hibernate.pojo.Student;

public class StudentDaoImpl extends AbstractBaseDao<Student> implements StudentDao {
	
	private static final String HQL_GET_STUDENT_BY_NAME = "from Student where name = :name";
	
	@SuppressWarnings("unchecked")
	@Override
	public Set<Student> getStudentByName(String name) {
		Session session = hibernateUtils.getSession();
		List<Student> list = (List<Student>) session.createQuery(HQL_GET_STUDENT_BY_NAME).setParameter("name", name).list();
		hibernateUtils.closeSession();
		return new HashSet<>(list);
	}

	@Override
	public Set<Student> loadAll() {
		return loadAll(Student.class);
	}

}