package br.com.emerson.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public interface RestService {

    @GET
    String hello();

    @GET
    @Path("/info")
    @Produces("application/json")
    Response getInfos();
}
