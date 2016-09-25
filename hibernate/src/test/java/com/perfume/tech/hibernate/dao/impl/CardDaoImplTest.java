package com.perfume.tech.hibernate.dao.impl;

import java.util.Date;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.perfume.tech.hibernate.dao.CardDao;
import com.perfume.tech.hibernate.dao.StudentDao;
import com.perfume.tech.hibernate.pojo.Card;
import com.perfume.tech.hibernate.pojo.Student;
import com.perfume.tech.hibernate.utils.HibernateUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardDaoImplTest {
	
	private static final Logger logger = Logger.getLogger(CardDaoImplTest.class);
	
	private static CardDao cardDao;
	private static StudentDao studentDao;
	private static HibernateUtils hibernateUtils;
	private Card card;
	private Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentDao = new StudentDaoImpl();
		cardDao = new CardDaoImpl();
		hibernateUtils = HibernateUtils.getInstance();
		cardDao.setHibernateUtils(hibernateUtils);
		studentDao.setHibernateUtils(hibernateUtils);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		card = new Card("611456217869", 1000);
		student = new Student("lucy", "女", new Date());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01CascadeSave() {
		card.setStudent(student);
		student.setCard(card);
		cardDao.save(card);

		logger.debug(studentDao.getStudentByName(student.getName()));
	}
	
	/**
	 * Since we configured the cascade on both side of Student and Card<br>
	 * Should be cascading either delete Student or delete Card
	 */
	@Test
	public void test02CascadeDelete() {
		
		logger.debug(studentDao.loadAll());
		
		//cardDao.delete(cardDao.findCardByNumber(card.getNumber()));
		
		Set<Student> set = studentDao.getStudentByName(student.getName());
		for(Student s : set) {
			studentDao.delete(s);
		}
		
		logger.debug(studentDao.loadAll());
	}

}
