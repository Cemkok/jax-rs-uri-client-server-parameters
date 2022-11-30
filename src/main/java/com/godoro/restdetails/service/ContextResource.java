package com.godoro.restdetails.service;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/context")
public class ContextResource {
	@Context
	private UriInfo uriInfo;
	
	@GET
	@Path("/uri")
	@Produces("application/json; charset=UTF-8")
	public String getUri()
			
	{
		String path= uriInfo.getPath();
		String baseUri=uriInfo.getBaseUri().toString();
		String absolutePath=uriInfo.getAbsolutePath().toString();
		
		
		return "{\n" +"\t\"path\":\""+path+"\"\n"+ 
		"\t\"baseUri\":\""+baseUri+"\"\n"+
		"\t\"absolutePath\":\""+absolutePath+"\"\n"+"}";
				
	}

}
