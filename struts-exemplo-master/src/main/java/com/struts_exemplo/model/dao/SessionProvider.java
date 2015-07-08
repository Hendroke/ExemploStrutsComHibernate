package com.struts_exemplo.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionProvider{

	private static Session session;

	private static SessionFactory sessionFactory;

	private static SessionFactory getSessionFactory() {
		if ( sessionFactory == null ) {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings( configuration.getProperties() );
			sessionFactory = configuration.buildSessionFactory( builder.build() );
		}
		return sessionFactory;
	}

	public static Session getSession() {
		if ( session == null || !session.isOpen() ) {
			session = getSessionFactory().openSession();
		}
		return session;
	}

}
