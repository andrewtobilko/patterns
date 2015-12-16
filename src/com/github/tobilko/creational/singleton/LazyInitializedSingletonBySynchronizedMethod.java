package com.tobilko.singleton;

public class LazyInitializedSingletonBySynchronizedMethod {

    private static volatile LazyInitializedSingletonBySynchronizedMethod instance;

    private LazyInitializedSingletonBySynchronizedMethod() {}

    public static synchronized LazyInitializedSingletonBySynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingletonBySynchronizedMethod();
        }
        return instance;
    }

}
