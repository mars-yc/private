package com.perfume.tech.hibernate.pojo;

import java.util.Set;

/**
 * ManyToMany when mapped with Student
 * 
 * @author Perfume
 *
 */
public class Teacher {

	private Integer id;
	private String name;
	private String gender;
	private String title;

	private Set<Student> student;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

}