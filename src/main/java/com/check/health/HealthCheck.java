package com.check.health;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("api")
public class HealthCheck {
	
	@GET
    @Produces("application/json")
	@Path("/health")
    public String healthCheck() {
        return "hello jersey from spring boot";
    }
}
