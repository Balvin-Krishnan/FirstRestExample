package com.balvin.service;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/webservice")
public class HelloWorld {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("/showGreeting/{message}")
	public String showGreetingMessage(@PathParam("message") String message){
		return "Server Says "+message;
	}
}
