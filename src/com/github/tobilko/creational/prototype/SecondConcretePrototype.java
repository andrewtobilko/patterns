package com.github.tobilko.creational.prototype;

public class SecondConcretePrototype extends Prototype {
    @Override
    public Prototype duplicate() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}