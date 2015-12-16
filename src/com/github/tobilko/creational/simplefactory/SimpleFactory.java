package com.tobilko.simplefactory;

/**
 *  Realizes a <b>Simple Factory</b> pattern.
 *  It doesn't relate to standard design patterns (GoF, for example).
 *
 *  @author Andrew Tobilko
 */
public class SimpleFactory {
    /**
     *  Analyzes a condition and returns a concrete instance of a general interface.
     *
     *  @param condition еhe condition that determines a creation of a certain class
     *  @return a concrete {@code Interface} instance
     */
    public Interface createConcreteInstance(boolean condition) {
        return condition ?
                new FirstConcreteClass() :
                new SecondConcreteClass();
    }
}
