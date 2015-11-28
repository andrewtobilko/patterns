package com.tobilko.templatemethod;

/**
 *  Implementation of additional parts of algorithm by
 *  overriding abstract methods of {@code AbstractClass}.
 *
 *  @author Andrew Tobilko
 *
 *  @see AbstractClass
 *  @see Client
 */
public class ConcreteClass extends AbstractClass {

    /**
     *  Implementation of "before-part" of algorithm.
     */
    @Override
    protected void beforeExecutingOfAlgorithm() {}

    /**
     *  Implementation of "after-part" of algorithm.
     */
    @Override
    protected void afterExecutingOfAlgorithm() {}

}
