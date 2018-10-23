package com.aathif.learning.microservice;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.aathif.learning.microservice.api.UserResource;

@Component
public class RESTConfig extends ResourceConfig {

	public RESTConfig() {
		register(UserResource.class);
	}

}
