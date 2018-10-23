package com.aathif.learning.microservice.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.aathif.learning.microservice.service.RegistrationService;

@Path("/user")
public class UserResource {

	private final RegistrationService registrationService;

	@Autowired
	public UserResource(RegistrationService registrationUserService) {
		this.registrationService = registrationUserService;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerUser(String user) {
		return Response.ok(registrationService.registerUser(user)).build();
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUsers() {
		return Response.ok(registrationService.getAllUsers()).build();
	}
	
}
