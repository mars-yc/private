package com.perfume.tech.hibernate.dao.impl;

import java.util.Date;
import java.util.HashSet;
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

import com.perfume.tech.hibernate.dao.StudentDao;
import com.perfume.tech.hibernate.dao.TeacherDao;
import com.perfume.tech.hibernate.pojo.Student;
import com.perfume.tech.hibernate.pojo.Teacher;
import com.perfume.tech.hibernate.utils.HibernateUtils;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeacherDaoImplTest {
	
	private static final Logger logger = Logger.getLogger(TeacherDaoImplTest.class);
	
	private static HibernateUtils hibernateUtils;
	private static StudentDao studentDao;
	private static TeacherDao teacherDao;
	private Teacher teacher1;
	private Teacher teacher2;
	private Student student1;
	private Student student2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		hibernateUtils = HibernateUtils.getInstance();
		teacherDao = new TeacherDaoImpl();
		studentDao = new StudentDaoImpl();
		teacherDao.setHibernateUtils(hibernateUtils);
		studentDao.setHibernateUtils(hibernateUtils);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		teacher1 = new Teacher("Kevin", "男", "院长");
		teacher2 = new Teacher("Ted", "男", "班主任");
		student1 = new Student("Lily", "女", new Date());
		student2 = new Student("Poly", "男", new Date());
		
		teacher1.setStudents(new HashSet<>());
		teacher2.setStudents(new HashSet<>());
		student1.setTeachers(new HashSet<>());
		student2.setTeachers(new HashSet<>());
		
		teacher1.getStudents().add(student1);
		teacher1.getStudents().add(student2);
		student1.getTeachers().add(teacher1);
		student2.getTeachers().add(teacher1);
		
		teacher2.getStudents().add(student1);
		student1.getTeachers().add(teacher2);
	}

	@After
	public void tearDown() throws Exception {
	}
	
//	@Ignore
	@Test
	public void test03CascadeDelete() {
		System.out.println(">>>>>>>>>>starts test03CascadeDelete");
		Set<Teacher> set = teacherDao.findByName(teacher1.getName());
		Assert.assertTrue(set.size() == 1);
		for(Teacher tea : set) {
			Set<Student> stus = tea.getStudents();
			if(null != stus) {
				for(Student s : stus) {
					s.getTeachers().remove(tea); //Student manages the relation mapping
				}
			}
			teacherDao.delete(tea);
		}
		logger.debug(teacherDao.loadAll());
	}
	
	@Ignore
	@Test
	public void test02CascadeDelete() {
		System.out.println(">>>>>>>>>>starts test02CascadeDelete");
		Set<Student> set = studentDao.getStudentByName(student1.getName());
		Assert.assertNotNull(set);
		for(Student stu : set) {
			studentDao.delete(stu);
		}
		logger.debug(studentDao.getStudentByName(student2.getName()));
	}

	@Test
	public void test01CascadeSave() {
		System.out.println(">>>>>>>>>>starts test01CascadeSave");
		Set<Teacher> set = student1.getTeachers();
		for(Teacher tc : set) {
			teacherDao.save(tc);
		}
		studentDao.save(student1);
	}

}
