package org.objectstyle.cayenne;

import org.apache.cayenne.di.DIRuntimeException;
import org.apache.cayenne.di.Inject;
import org.apache.cayenne.di.Provider;
import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.ServiceImpl;
import org.objectstyle.di.service.SubService;

public class SubServiceProvider implements Provider<Service> {

    @Inject
    private SubService subService;

    @Override
    public Service get() throws DIRuntimeException {
        return new ServiceImpl(subService);
    }
}
