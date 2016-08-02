package br.com.emerson.service;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.emerson.model.InfoSystem;

public class DefaultRestService implements RestService {

    private InfoSystem infoSystem;
    private static final Logger logger = LoggerFactory.getLogger(DefaultRestService.class);

    @Inject
    DefaultRestService(InfoSystem infoSystem) {
        this.infoSystem = infoSystem;
    }

    public String hello() {
        logger.debug("Hello system");
        return "Hello system!!!";
    }

    public Response getInfos() {
        try {
            logger.debug("Information about this system");
            return Response.ok().entity(infoSystem).build();
        } catch (Exception e) {
            logger.error("Error with infos");
            return Response.serverError().entity("Error with infos").build();
        }
    }

}
