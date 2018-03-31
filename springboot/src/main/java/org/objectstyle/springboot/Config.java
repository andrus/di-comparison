package org.objectstyle.springboot;

import org.objectstyle.di.service.Service;
import org.objectstyle.di.service.ServiceImpl;
import org.objectstyle.di.service.SubService;
import org.objectstyle.di.service.SubServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Service service(SubService subService) {
        return new ServiceImpl(subService);
    }

    @Bean
    public SubService subService() {
        return new SubServiceImpl();
    }
}
