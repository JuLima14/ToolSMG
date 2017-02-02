package ar.com.smg.services.pantallas;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.smg.beans.Caso;
import ar.com.smg.database.DbContext;

@Path("/abmpantallas")
public class RegistrarPantallaService {

	
	@GET
	@Path("/registrar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrar() {

		try {
			new DbContext().getConnection();
			System.out.println("CONECTADO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return Response.status(200).entity("hola").build();

	}

}
