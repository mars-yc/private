package com.perfume.tech.hibernate.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.perfume.tech.hibernate.dao.ConfidentialDao;
import com.perfume.tech.hibernate.dao.StudentDao;
import com.perfume.tech.hibernate.pojo.Confidential;
import com.perfume.tech.hibernate.pojo.Student;

public class ConfidentialDaoImplTest {
	
	private static final Logger logger = Logger.getLogger(ConfidentialDaoImplTest.class);
	
	private static Student studentLily;
	private static Student studentLucy;
	private static Confidential confidential;
	private static StudentDao studentDao;
	private static ConfidentialDao confidentialDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentLily = new Student("lily", "女", new Date());
		studentLucy = new Student("lucy", "女", new Date());
		confidential = new Confidential("ctm386", new Date(), new Date());
		studentDao  = new StudentDaoImpl();
		confidentialDao = new ConfidentialDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetConfidentialByUserName() {
	}

	@Test
	public void testLoadAll() {
	}

}
