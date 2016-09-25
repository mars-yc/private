package com.perfume.tech.hibernate.dao;

import java.util.Set;

import com.perfume.tech.hibernate.pojo.Student;

public interface StudentDao extends BaseDaoInterface<Student> {
	
	Set<Student> getStudentByName(String name);

}