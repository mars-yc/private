package com.perfume.tech.hibernate.pojo;

/**
 * 
 * For one to one mapping with Student
 * 
 * @author Perfume
 *
 */
public class Card {

	private Integer id;
	private String number;
	private double balance;

	private Student student;

	public Card() {
		super();
	}

	public Card(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", number=" + number + ", balance=" + balance + "]";
	}

}
