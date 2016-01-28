package com.github.tobilko.creational.prototype;

public class ConcretePrototype2 extends Prototype {

    @Override
    public Prototype duplicate() throws CloneNotSupportedException {
        return (ConcretePrototype2) this.clone();
    }

}