package com.github.tobilko.creational.singleton;

public class EagerlyInitializedSingletonByField {
    public static final EagerlyInitializedSingletonByField INSTANCE =
            new EagerlyInitializedSingletonByField();

    private EagerlyInitializedSingletonByField() {}
}
