package org.objectstyle.cayenne;

import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;
import org.objectstyle.dagger.service.Service;
import org.objectstyle.dagger.service.ServiceImpl;
import org.objectstyle.dagger.service.SubService;

public class SubServiceProvider implements Provider<Service> {

    @Inject
    private SubService subService;

    @Override
    public Service get() throws DIRuntimeException {
        return new ServiceImpl(subService);
    }
}
