
package com.zebardast.jerseystarterkit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloRequest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello World!";
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld(String name) {
        return "Hello " + name + "!";
    }
}

