package com.perfume.tech.hibernate.dao.impl;

import java.util.Date;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.perfume.tech.hibernate.dao.ConfidentialDao;
import com.perfume.tech.hibernate.dao.StudentDao;
import com.perfume.tech.hibernate.pojo.Confidential;
import com.perfume.tech.hibernate.pojo.Student;
import com.perfume.tech.hibernate.utils.HibernateUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConfidentialDaoImplTest {
	
	private static final Logger logger = Logger.getLogger(ConfidentialDaoImplTest.class);
	
	private static Student student;
	private static Confidential confidential;
	private static StudentDao studentDao;
	private static ConfidentialDao confidentialDao;
	private static HibernateUtils hibernateUtils;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		student = new Student("lily", "女", new Date());
		confidential = new Confidential("ctm386", new Date(), new Date());
		studentDao  = new StudentDaoImpl();
		confidentialDao = new ConfidentialDaoImpl();
		
		hibernateUtils = HibernateUtils.getInstance();
		studentDao.setHibernateUtils(hibernateUtils);
		confidentialDao.setHibernateUtils(hibernateUtils);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		hibernateUtils.close();
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

	@Ignore
	@Test
	public void testLoadAll() {
		Set<Confidential> set = confidentialDao.loadAll();
		logger.debug(set);
		Assert.assertTrue(set.size() == 1);
	}
	
	@Test
	public void test03CascadeDelete() {
		Confidential cfd = confidentialDao.getConfidentialByUserName(confidential.getUsername());
		confidentialDao.delete(cfd);
		Assert.assertTrue(confidentialDao.loadAll().size() == 0);
	}
	
	@Test
	public void test02GetByName() {
		logger.debug(confidentialDao.getConfidentialByUserName(confidential.getUsername()));
	}
	
	@Test
	public void test01CascadeSave() {
		student.setConfidential(confidential);
		confidential.setStudent(student);
		studentDao.save(student);
		confidentialDao.save(confidential);
		logger.debug(confidential);
	}

}