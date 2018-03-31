package org.objectstyle.di.service;

public class ServiceImpl implements Service {

    private SubService subService;

    public ServiceImpl(SubService subService) {
        this.subService = subService;
    }

    public String doIt() {
        return "ServiceImpl_" + subService.doIt();
    }
}
