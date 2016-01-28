package com.github.tobilko.creational.factorymethod;

/**
 *  Describes an implementation of a factory method.
 *
 *  @author Andrew Tobilko
 *
 *  @see Creator
 *  @see Element
 *  @see ConcreteElement
 */
public class ConcreteCreator extends Creator {
    /**
     *  Implements a part of "factory method" pattern and returns
     *  a concrete object of {@code Element} type.
     *
     *  @return the object of {@code ConcreteElement}
     */
    @Override
    protected Element create() {
        return new ConcreteElement();
    }
}