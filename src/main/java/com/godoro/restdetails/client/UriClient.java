package com.godoro.restdetails.client;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class UriClient {
	
	public static void main(String[] args) {
		
//		Client clientXml = ClientBuilder.newClient();
//		
//		WebTarget target = clientXml
//				.target("http://localhost:8089/restbinding/rest")
//				.path("Xml")
//				.path("binding");
//		
//		String plain=target.request("application/xml; charset=UTF-8")
//				.get(String.class);
//		System.out.println("Düz:\n"+plain);
			
		
		/**
		 * Aşağıdaki işlemler bir Client oluşuturup, path verip , 
		 * çekeceği veri tipini tanımlayıp, 
		 * String'e çevirip, çıktıyı console' a yazdırır.
		 */
		Client clientJson = ClientBuilder.newClient();
			WebTarget target = clientJson
				.target("http://localhost:8089/restdetails/rest")
				.path("uri");
			
			String path=target
					.path("path")
				.path("12345")
					.request("application/json; charset=UTF-8")
					.get(String.class);
			System.out.println("path : \n" + path);
			
			String query=target
					.path("query")
					.queryParam("input",1234)
					.request("application/json; charset=UTF-8")
					.get(String.class);
			System.out.println("Query : \n" + query);	
			
			String matrix=target
					.path("matrix")
					.matrixParam("input",1111)
					.request("application/json; charset=UTF-8")
					.get(String.class);
			System.out.println("Matrix : \n" + matrix);	
			 
			 
			
			
		
			

	}
}
