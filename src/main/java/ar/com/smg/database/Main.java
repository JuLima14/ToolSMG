package ar.com.smg.database;

import java.sql.SQLException;

import org.hibernate.Session;

import ar.com.smg.pantalla.beans.Pantalla;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Pantalla pantalla = new Pantalla(0, "hola", "/adsda/asda",1);
		try {
		
			session.beginTransaction();
			session.save(pantalla);
			session.getTransaction().commit();
		
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
