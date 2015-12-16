package com.tobilko.singleton;

public class EagerlyInitializedSingletonByField {
    public static final EagerlyInitializedSingletonByField INSTANCE =
            new EagerlyInitializedSingletonByField();

    private EagerlyInitializedSingletonByField() {}
}
