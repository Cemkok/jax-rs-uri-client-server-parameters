package com.godoro.restdetails;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

@Path("/test")
public class TestResource {
	
	@GET
	@Path("example")
	@Produces("application/json; charset=UTF-8")
	public String getPlain() {
		double value=12.34;
		
 return "{\n" +
 		"\t\"value\":"+value + "\n"+
		"}";
	

	
	
}

}
