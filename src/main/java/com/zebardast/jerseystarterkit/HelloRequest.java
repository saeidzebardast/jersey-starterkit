
package com.zebardast.jerseystarterkit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloRequest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
       return "Hello World!";
    }

}

