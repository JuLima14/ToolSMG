package ar.com.smg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test/")
public class ServicioTest {

	@GET
	@Path("/prueba")
	public String ejecutarServicioREST() {

		return "Funciona OK!!";
	}

}
