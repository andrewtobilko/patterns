package com.tobilko.singleton;

public class EagerlyInitializedSingletonByMethod {
    private static final EagerlyInitializedSingletonByMethod INSTANCE =
            new EagerlyInitializedSingletonByMethod();

    public static EagerlyInitializedSingletonByMethod getInstance() {
        return INSTANCE;
    }

    private EagerlyInitializedSingletonByMethod() {}
}
