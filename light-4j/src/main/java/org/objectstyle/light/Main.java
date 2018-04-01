package org.objectstyle.light;

import com.networknt.service.SingletonServiceFactory;
import org.objectstyle.di.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = SingletonServiceFactory.getBean(Service.class);
        System.out.println(service.doIt());
    }
}
