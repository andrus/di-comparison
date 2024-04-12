package org.objectstyle.bootique.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.objectstyle.di.service.Meter;
import org.objectstyle.di.service.Service;

import javax.inject.Inject;

@Path("")
public class Api {

    @Inject
    Service service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        Meter.runMetrics();
        return service.doIt();
    }
}
