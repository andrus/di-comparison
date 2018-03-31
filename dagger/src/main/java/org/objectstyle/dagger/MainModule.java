package org.objectstyle.dagger;

import dagger.Module;
import dagger.Provides;
import org.objectstyle.dagger.service.Service;
import org.objectstyle.dagger.service.ServiceImpl;
import org.objectstyle.dagger.service.SubService;
import org.objectstyle.dagger.service.SubServiceImpl;

import javax.inject.Singleton;

@Module
public class MainModule {

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
