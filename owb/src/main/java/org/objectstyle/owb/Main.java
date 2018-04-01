package org.objectstyle.owb;


import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.CDI;

import org.objectstyle.di.service.Service;

public class Main {

    public static void main(String[] args) {
        SeContainer cdiContainer = SeContainerInitializer.newInstance()
                .disableDiscovery()
                .addBeanClasses(MainModule.class)
                .initialize();
        Service s = CDI.current().select(Service.class).get();

        System.out.println(s.doIt());
    }
}
