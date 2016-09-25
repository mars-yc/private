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

	private Set<Student> students;

	public Teacher() {
		super();
	}

	public Teacher(String name, String gender, String title) {
		super();
		this.name = name;
		this.gender = gender;
		this.title = title;
	}

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

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", gender=" + gender + ", title=" + title + "]";
	}

}