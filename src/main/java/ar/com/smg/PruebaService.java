package ar.com.smg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class PruebaService {

	@GET
	@Path("/nada")
	public Response getMsg() {

		String output = "Jersey say : nada";

		return Response.status(200).entity(output).build();

	}

	
}
