package com.github.tobilko.structural.flyweight;

/**
 * Represents a class, instances of which will be used many times.
 * It's the underlying concept of the flyweight pattern.
 *
 * @author Andrew Tobilko
 */
public abstract class Flyweight {

    private String name;

    public Flyweight(String n) { name = n; }

}
