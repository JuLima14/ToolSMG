package ar.com.smg.services.casos;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.hibernate.Session;
import ar.com.smg.database.HibernateUtil;
import ar.com.smg.entities.Caso;

@Path("/casos")
public class CasosService {

	
	Gson gson = new Gson();
//	Gson gson = new GsonBuilder().setDateFormat("MMM d, yyyy").create();
	
	@POST
	@Path("/registrar")
	@Consumes("application/json")
	@Produces("application/json")
	public Response registrar(String pantalla) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
		
			session.beginTransaction();
			session.save(gson.fromJson(pantalla,Caso.class));
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
	@Produces("application/json")
	public Response getCasos(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from casos").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}
	

	@GET
	@Path("/get/{id}")
	@Produces("application/json")
	public Response getCasos(@PathParam("id") int id){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from Caso where IdCaso = :idcaso")
						.setParameter("idcaso", id)
						.getResultList());
//			Caso caso = new Caso();
//			caso = gson.fromJson(response, Caso.class);
			System.out.println(response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}
	
	
	@GET
	@Path("/getModulos")
	@Produces("application/json")
	public Response getModulos(){
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from modulos").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}
	
	@GET
	@Path("/getPrioridades")
	@Produces("application/json")
	public Response getPrioridades(){
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from prioridades").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}
	
	@GET
	@Path("/getEstados")
	@Produces("application/json")
	public Response getEstados(){

		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from estadoscaso").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}

	@GET
	@Path("/getSeveridades")
	@Produces("application/json")
	public Response getSeveridades(){
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from severidades").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}

	@GET
	@Path("/getSoportes")
	@Produces("application/json")
	public Response getSoportes(){
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		String response = null;
		
		try {
			
			session.beginTransaction();
			response = gson.toJson(session.createQuery("from soportes").getResultList());

		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return Response.ok(response).build();
	}
	
}
