package org.objectstyle.cayenne;

import org.apache.cayenne.di.DIBootstrap;
import org.objectstyle.di.service.Service;

public class Main {

    public static void main(String[] args) {
        Service s = DIBootstrap.createInjector(new MainModule()).getInstance(Service.class);
        System.out.println(s.doIt());
    }
}
