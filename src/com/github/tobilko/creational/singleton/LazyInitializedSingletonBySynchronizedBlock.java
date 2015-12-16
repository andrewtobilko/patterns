package com.tobilko.singleton;

public class LazyInitializedSingletonBySynchronizedBlock {

    private static volatile LazyInitializedSingletonBySynchronizedBlock instance;

    private LazyInitializedSingletonBySynchronizedBlock() {}

    public static LazyInitializedSingletonBySynchronizedBlock getInstance() {
        if (instance == null) {
            synchronized (LazyInitializedSingletonBySynchronizedBlock.class) {
                if (instance == null) {
                    instance = new LazyInitializedSingletonBySynchronizedBlock();
                }
            }
        }
        return instance;
    }
}
