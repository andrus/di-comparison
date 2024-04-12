package org.objectstyle.bootique;

import io.bootique.Bootique;

public class Main {

    public static void main(String[] args) {
        Bootique.app(args).autoLoadModules().exec();
    }
}
