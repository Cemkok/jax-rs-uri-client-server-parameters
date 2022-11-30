package com.godoro.restdetails.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/uri")
public class UriResource {
	
	@GET
	//Değişken değer vermek istemezsen  default değer geçebilirsin.
	@Path("path")
	@Produces("application/json; charset=UTF-8")
	public String getPath(  @DefaultValue("9999") long input) {
		
		
 return "{\n" +
 		"\t\"input\":"+input + "\n"+
		"}";

}
	@GET
	//Eğer {input}  verilirse girmek zorundasın, verilmezse default değer geçebilirsin
	@Path("path/{input}")
	@Produces("application/json; charset=UTF-8")
	public String getPath2(@PathParam("input")  long input) {
		
		
 return "{\n" +
 		"\t\"input\":"+input + "\n"+
		"}";

}
	@GET
	
	@Path("query")
	@Produces("application/json; charset=UTF-8")
	public String getQuery(@QueryParam("input")  long input) {
		
 return "{\n" +
 		"\t\"input\":"+input + "\n"+
		"}";

}
	
	@GET
	
	@Path("matrix")
	@Produces("application/json; charset=UTF-8")
	public String getMatrix(@MatrixParam("input")  long input) {
		
 return "{\n" +
 		"\t\"input\":"+input + "\n"+
		"}";

}
}