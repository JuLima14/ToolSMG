package ar.com.smg.services.pantallas;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;
import ar.com.smg.entities.Pantalla;
import org.hibernate.Session;
import ar.com.smg.database.HibernateUtil;


@Path("/pantallas")
public class RegistrarPantallaService {

	
	Gson gson = new Gson();
	
	@POST
	@Path("/registrar")
	@Consumes("application/json")
	@Produces("application/json")
	public Response registrar(String pantalla) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
		
			session.beginTransaction();
			session.save(gson.fromJson(pantalla,Pantalla.class));
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
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		try {
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from Pantalla").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}

		return Response.ok(response).build();
	}
	

}
