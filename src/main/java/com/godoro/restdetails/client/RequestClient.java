package com.godoro.restdetails.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


public class RequestClient {


	public static void main(String[] args) {
		
		Client clientXml = ClientBuilder.newClient();
		
		WebTarget target = clientXml
				.target("http://localhost:8089/restdetails/rest")
				.path("request");
			
		String header=target
				.path("header")
				.request("application/json; charset=UTF-8")
				.header("input", 1234)
				.get(String.class);
		System.out.println("Başlık:\n" +header);
		
		String cookie=target
				.path("cookie")
				.request("application/json; charset=UTF-8")
				.cookie("input", Long.toString(1234))
				.get(String.class);
		System.out.println("Çerez:\n" +cookie);
		
		
		
		
				
				
			
					
}}
