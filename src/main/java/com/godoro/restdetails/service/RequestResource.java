package com.godoro.restdetails.service;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/request")
public class RequestResource {

	
	@GET
	@Path("/header")
	@Produces("application/json; charset=UTF-8")
	public String getHeader(
			@HeaderParam("input") long input) 
	{
		return "{\n" +"\t\"input\":"+input+"\n"+ "}";
				
	}
	

	
	@GET
	@Path("/cookie")
	@Produces("application/json; charset=UTF-8")
	public String getCookie(
			@CookieParam("input") long input) 
	{
		return "{\n" +"\t\"input\":"+input+"\n"+ "}";
				
	}
		
	
		
	
	
}
