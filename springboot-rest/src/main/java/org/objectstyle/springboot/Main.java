package org.objectstyle.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.ManagementFactory;
import java.time.LocalDateTime;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        // measuring JVM start time
        System.out.println(ManagementFactory.getRuntimeMXBean().getUptime());

        // timestamping the app start point
        System.out.println(LocalDateTime.now());

        SpringApplication.run(Main.class, args);
    }
}
