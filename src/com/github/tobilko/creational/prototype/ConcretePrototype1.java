package com.github.tobilko.creational.prototype;

public class ConcretePrototype1 extends Prototype {

    @Override
    public Prototype duplicate() throws CloneNotSupportedException {
        return (ConcretePrototype1) this.clone();
    }

}