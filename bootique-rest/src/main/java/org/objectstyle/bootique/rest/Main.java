package org.objectstyle.bootique.rest;

import io.bootique.Bootique;

import java.lang.management.ManagementFactory;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // measuring JVM start time
        System.out.println(ManagementFactory.getRuntimeMXBean().getUptime());

        // timestamping the app start point
        System.out.println(LocalDateTime.now());

        Bootique.app(args).autoLoadModules().exec().exit();
    }
}
