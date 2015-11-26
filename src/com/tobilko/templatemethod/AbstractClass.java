package com.tobilko.templatemethod;

/**
 *  Describes an execution of algorithm with "Template method" pattern in it.
 *
 *  @author Andrew Tobilko
 *
 *  @see ConcreteClass
 *  @see Client
 */
public abstract class AbstractClass {

    /**
     * Describes an algorithms fully.
     */
    public final void templateMethod() {
        beforeExecutingAlgorithm();
        executeAlgorithm();
        afterExecutingAlgorithm();
    }

    /**
     * The main part of algorithm. It is used to describe
     * major features and unchanging parts.
     */
    private void executeAlgorithm() {}

    /**
     *  The part of algorithm that executes <b>before</b> the main section.
     */
    protected abstract void beforeExecutingAlgorithm();

    /**
     *  The part of algorithm that executes <b>after</b> the main section.
     */
    protected abstract void afterExecutingAlgorithm();

}
