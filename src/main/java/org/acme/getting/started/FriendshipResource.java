package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class FriendshipResource {

    @Inject
    FriendshipService service;

    @GET
    @Path("/friend/{name}")
    public Friend getFriend(@PathParam("name") String name) {
        return service.generate(name);
    }
}
