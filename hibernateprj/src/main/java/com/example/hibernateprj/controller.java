package com.example.hibernateprj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class controller {

	@SuppressWarnings("deprecation")//duplicate for save
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
		org.hibernate.SessionFactory sf= md.getSessionFactoryBuilder().build();
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		hiber h = new hiber();
		h.setName("nikitha");
		h.setEmail("nikitha@gmail.com");
		h.setPassword("nikitha@1234");
		h.setPhonenumber(1234567890);
		s.save(h);
		t.commit();
		System.out.println("successfully Inserted");
		s.close();
		sf.close();
	}
}
