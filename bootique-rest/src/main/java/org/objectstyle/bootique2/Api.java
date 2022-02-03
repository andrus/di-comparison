package org.objectstyle.bootique2;

import org.objectstyle.di.service.Meter;
import org.objectstyle.di.service.Service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
