package com.check.health;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@Path("api")
@CrossOrigin("*")
public class HealthCheck {
	
	@GET
    @Produces("application/json")
	@Path("/health")
    public String healthCheck() {
        return "hello jersey from spring boot";
    }
}
