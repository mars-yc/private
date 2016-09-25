package com.perfume.tech.hibernate.pojo;

import java.util.Date;
import java.util.Set;

/**
 * OneToOne when mapped with Confidential<br>
 * OneToMany when mapped with Class<br>
 * ManyToMany when mapped with Teacher
 * 
 * @author Perfume
 *
 */
public class Student {

	private Integer id;
	private String name;
	private String gender;
	private Date birthday;

	private Confidential confidential;
	private Clazz clazz;
	private Set<Teacher> teachers;
	
	private Card card;

	public Student() {
		super();
	}

	public Student(String name, String gender, Date birthday) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Confidential getConfidential() {
		return confidential;
	}

	public void setConfidential(Confidential confidential) {
		this.confidential = confidential;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", clazz="
				+ clazz + ", teachers=" + teachers + ", card=" + card + "]";
	}

}