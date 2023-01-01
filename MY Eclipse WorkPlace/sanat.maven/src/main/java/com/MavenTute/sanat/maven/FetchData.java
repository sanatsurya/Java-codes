package com.MavenTute.sanat.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		//get-info
		Student student =(Student)session.get(Student.class,1);
		System.out.println(student);
		Lectures lectures =(Lectures)session.get(Lectures.class, 1);
		System.out.println(lectures);
		session.close();
		factory.close();
	}

}
