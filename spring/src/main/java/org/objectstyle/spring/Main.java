package org.objectstyle.spring;

import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.ServiceImpl;
import org.objectstyle.di.service.SubService;
import org.objectstyle.di.service.SubServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Main {

    @Bean
    public Service service(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Bean
    public SubService subService() {
        return new SubServiceImpl();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean(Service.class).doIt());
    }
}