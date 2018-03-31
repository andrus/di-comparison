package org.objectstyle.dagger;

public class Main {

    public static void main(String[] args) {
        Root r = DaggerRoot.create();
        System.out.println(r.service().doIt());
    }
}
