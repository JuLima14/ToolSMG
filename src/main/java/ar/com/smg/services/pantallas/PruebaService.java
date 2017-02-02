package ar.com.smg.services.pantallas;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import ar.com.smg.database.DbContext;

@Path("/hello")
public class PruebaService {

	@GET
	@Path("/nada")
	public Response getMsg() {

		String output = "Jersey say : nada";
		try {
			new DbContext().getConnection() ;
			System.out.println("CONECTADO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(output).build();

	}

	
}
