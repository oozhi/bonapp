package com.bonapp.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1")
public class BonappService {

	@GET
	@Path("/serviceprovider")
	public Response reponseMsg (){
        String output = "Hello from: Jersey ";
        return Response.status(200).entity(output).build();
	}

}
