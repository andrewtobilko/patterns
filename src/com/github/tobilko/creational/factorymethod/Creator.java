package com.tobilko.factorymethod;

/**
 *  Delegates {@code Element} creation to subclasses
 *  by using {@code create} method.
 *
 *  @author Andrew Tobilko
 *
 *  @see ConcreteCreator
 *  @see Element
 *  @see ConcreteElement
 */
public abstract class Creator {
    /**
     *  Demonstrates an example of the "factory method" pattern.
     *
     *  @return a concrete object of {@code Element} type
     */
    protected abstract Element create();

}
