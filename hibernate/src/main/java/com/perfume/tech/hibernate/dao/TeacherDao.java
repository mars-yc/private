package com.perfume.tech.hibernate.dao;

import java.util.Set;

import com.perfume.tech.hibernate.pojo.Teacher;

public interface TeacherDao extends BaseDaoInterface<Teacher> {
	
	Set<Teacher> findByName(String name);

}
