package com.github.tobilko.creational.prototype;

public abstract class Prototype implements Cloneable {

    public abstract Prototype duplicate() throws CloneNotSupportedException;

}