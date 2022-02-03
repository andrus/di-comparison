package org.objectstyle.bootique2;

import io.bootique.BQCoreModule;
import io.bootique.BaseModule;
import io.bootique.di.Binder;
import io.bootique.di.Provides;
import io.bootique.jersey.JerseyModule;
import io.bootique.jetty.command.ServerCommand;
import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.ServiceImpl;
import org.objectstyle.di.service.SubService;
import org.objectstyle.di.service.SubServiceImpl;

import javax.inject.Singleton;

public class MainModule extends BaseModule  {

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).setDefaultCommand(ServerCommand.class);
        JerseyModule.extend(binder).addResource(Api.class);
    }

    @Provides
    @Singleton
    Service provideService(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Provides
    @Singleton
    SubService provideSubService() {
        return new SubServiceImpl();
    }
}
