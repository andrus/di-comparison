package org.objectstyle.dagger;

import dagger.Component;
import org.objectstyle.dagger.service.Service;

import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface Root {

    Service service();
}
