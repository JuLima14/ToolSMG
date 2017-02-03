package ar.com.smg.database;

import java.sql.SQLException;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.createNamedQuery("select * from pantalla").executeUpdate();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
