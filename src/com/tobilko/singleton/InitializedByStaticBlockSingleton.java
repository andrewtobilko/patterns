package com.tobilko.singleton;

public class InitializedByStaticBlockSingleton {

    private static final InitializedByStaticBlockSingleton INSTANCE;

    static {
        INSTANCE = new InitializedByStaticBlockSingleton();
    }

    private InitializedByStaticBlockSingleton() {}
}
