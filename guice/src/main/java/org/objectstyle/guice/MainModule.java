package org.objectstyle.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import org.objectstyle.dagger.service.Service;
import org.objectstyle.dagger.service.ServiceImpl;
import org.objectstyle.dagger.service.SubService;
import org.objectstyle.dagger.service.SubServiceImpl;

import javax.inject.Singleton;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
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
