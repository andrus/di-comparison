package org.objectstyle.di.service;


public class Meter {

    public static void runMetrics() {
        System.gc();
        System.gc();

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Memory in use, bytes: %s\n", memory);
    }
}
