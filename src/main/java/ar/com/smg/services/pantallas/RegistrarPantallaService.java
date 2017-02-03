package ar.com.smg.services.pantallas;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;

import ar.com.smg.beans.Caso;
import ar.com.smg.database.DbContext;
import ar.com.smg.database.HibernateUtil;
import ar.com.smg.pantalla.beans.Pantalla;

@Path("/abmpantallas")
public class RegistrarPantallaService {

	
	@GET
	@Path("/registrar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrar() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Pantalla pantalla = new Pantalla(0, "hola", "/adsda/asda",1);
		try {
		
			session.beginTransaction();
			session.save(pantalla);
			session.getTransaction().commit();
		
		} catch (Exception e) {
			session.getTransaction().rollback();
			
			e.printStackTrace();
			return Response.status(200).entity("todo mal").build();
		}finally {
			session.close();
		}
				
		return Response.status(200).entity("todo OK").build();

	}

}
