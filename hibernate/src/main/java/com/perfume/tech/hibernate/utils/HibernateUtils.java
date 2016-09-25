package com.perfume.tech.hibernate.utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final Logger logger = Logger.getLogger(HibernateUtils.class);
	
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
		Session session = sessions.get();
		if(session == null) {
			synchronized(sessions) {
				if(session == null) {
					session = sessionFactory.openSession();
					sessions.set(session);
					if(logger.isDebugEnabled()) {
						logger.debug("open session - " + session.hashCode());
					}
				}
			}
		}
		return session;
	}
	
	/**
	 * Will not actually close the session
	 */
	public void closeSession() {
		if(logger.isDebugEnabled()) {
			logger.debug("free session - " + sessions.get().hashCode());
		}
	}
	
	public final void close() {
		Session session = sessions.get();
		if(session != null) {
			if(logger.isDebugEnabled()) {
				logger.debug("-----------------close session - " + sessions.get().hashCode());
			}
			session.close();
		}
	}

}