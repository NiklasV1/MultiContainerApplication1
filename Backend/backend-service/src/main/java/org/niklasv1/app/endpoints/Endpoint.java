package org.niklasv1.app.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/test")
public class Endpoint {

    @GET
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("/2/{name}")
    public String hello2(String name) {
        return "hello " + name;
    }
}
