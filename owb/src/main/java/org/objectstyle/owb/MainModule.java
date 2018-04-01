package org.objectstyle.owb;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.ServiceImpl;
import org.objectstyle.di.service.SubService;
import org.objectstyle.di.service.SubServiceImpl;

@ApplicationScoped
public class MainModule {

    @Produces
    @ApplicationScoped
    Service provideService(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Produces
    @ApplicationScoped
    SubService provideSubService() {
        return new SubServiceImpl();
    }
}
