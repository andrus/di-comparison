package org.objectstyle.cayenne;

import org.apache.cayenne.di.Binder;
import org.apache.cayenne.di.Module;
import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.SubService;
import org.objectstyle.di.service.SubServiceImpl;

public class MainModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(Service.class).toProvider(SubServiceProvider.class);
        binder.bind(SubService.class).to(SubServiceImpl.class);
    }
}
