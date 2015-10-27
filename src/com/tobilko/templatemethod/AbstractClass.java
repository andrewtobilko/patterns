package com.tobilko.templatemethod;

public abstract class AbstractClass {

    public final void templateMethod() {
        firstAbstractMethod();
        executeAlgorithm();
        secondAbstractMethod();
    }

    private void executeAlgorithm() {
        // the main part of the algorithm
    }

    public abstract void firstAbstractMethod();

    public abstract void secondAbstractMethod();

}
