package com.perfume.tech.hibernate.dao.impl;

import java.util.Date;
import java.util.Set;

import org.jboss.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
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
public class StudentDaoImplTest {
	
	private static final Logger logger = Logger.getLogger(StudentDaoImplTest.class);
	
	private static Student studentLily;
	private static Student studentLucy;
	private static Confidential confidential;
	private static StudentDao studentDao;
	private static ConfidentialDao confidentialDao;
	private static HibernateUtils hibernateUtils;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentLily = new Student("lily", "女", new Date());
		studentLucy = new Student("lucy", "女", new Date());
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

	@Ignore
	@Test
	public void test01Save() {
		studentDao.save(studentLily);
		logger.debug(studentLily);
	}

	@Ignore
	@Test
	public void test05Delete() {
		
	}

	@Ignore
	@Test
	public void testUpdate() {
		
	}
	
	/**
	 * Student must be persist before Confidential<br>
	 * Otherwise the cascade saving operation will be fail, and exception will be thrown saying 'transient instance must be saved before current operation'
	 */
	@Test
	public void test02CascadeSave() {
		studentLucy.setConfidential(confidential);
		confidential.setStudent(studentLucy);
		studentDao.save(studentLucy);
		confidentialDao.save(confidential);
		logger.debug(studentLucy);
		logger.debug(confidential);
	}
	
	/**
	 * Exception will be throw here since Student reference Credential.<br>
	 */
	@Test
	public void testCascadeDelete() {
		Set<Student> students = studentDao.getStudentByName("lucy");
		if(students != null) {
			for(Student student : students) {
				studentDao.delete(student);
			}
		}
		logger.debug(confidentialDao.loadAll());
		
	}

	@Ignore
	@Test
	public void test03GetByName() {
		Set<Student> students = studentDao.getStudentByName("lucy");
		logger.debug(students);
	}
	
	@Ignore
	@Test
	public void test04LoadAll() {
		Set<Student> set = studentDao.loadAll();
		logger.debug(set);
	}

}
