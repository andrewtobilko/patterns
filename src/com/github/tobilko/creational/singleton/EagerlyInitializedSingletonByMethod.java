package com.github.tobilko.creational.singleton;

public class EagerlyInitializedSingletonByMethod {
    private static final EagerlyInitializedSingletonByMethod INSTANCE =
            new EagerlyInitializedSingletonByMethod();

    public static EagerlyInitializedSingletonByMethod getInstance() {
        return INSTANCE;
    }

    private EagerlyInitializedSingletonByMethod() {}
}
