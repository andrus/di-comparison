package org.objectstyle.dagger;

import dagger.Component;
import org.objectstyle.di.service.Service;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface Root {

    Service service();
}
