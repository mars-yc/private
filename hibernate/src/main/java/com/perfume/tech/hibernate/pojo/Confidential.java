package com.perfume.tech.hibernate.pojo;

import java.util.Date;

public class Confidential {

	private Integer id;
	private String username;
	private Date registerTime;
	private Date lastLoginTime;

	private Student student;

	public Confidential() {
		super();
	}

	public Confidential(String username, Date registerTime, Date lastLoginTime) {
		super();
		this.username = username;
		this.registerTime = registerTime;
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Confidential [id=" + id + ", username=" + username + ", registerTime=" + registerTime
				+ ", lastLoginTime=" + lastLoginTime + ", student=" + student + "]";
	}

}