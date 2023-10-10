package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//obtain the session
		Session session=sf.openSession();
		session.beginTransaction();
		//------------




		
		
		
		
		
		
		
		

	
		
		session.getTransaction().commit();
		session.close();
       

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
