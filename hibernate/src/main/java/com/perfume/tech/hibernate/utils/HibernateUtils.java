package com.perfume.tech.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static HibernateUtils hibernateUtils;
	private ThreadLocal<Session> sessions = new ThreadLocal<>();
	
	private HibernateUtils() {}
	
	public static HibernateUtils getInstance() {
		if(hibernateUtils == null) {
			synchronized(HibernateUtils.class) {
				if(hibernateUtils == null) {
					hibernateUtils = new HibernateUtils();
				}
			}
		}
		return hibernateUtils;
	}
	
	static {
		Configuration cfg = new Configuration();
		/*cfg.addClass(com.perfume.tech.hibernate.pojo.Student.class);
		cfg.addClass(com.perfume.tech.hibernate.pojo.Confidential.class);*/
		cfg.addResource("hibernate.cfg.xml");
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	public void closeSession() {
		Session session = sessions.get();
		if(session != null) {
			session.close();
		}
	}

}