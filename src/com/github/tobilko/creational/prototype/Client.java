package com.github.tobilko.creational.prototype;

public class Client {

    public static void main(String... args) throws CloneNotSupportedException {
        Prototype firstConcretePrototype = new ConcretePrototype2();
        Prototype secondConcretePrototype = new ConcretePrototype1();

        Prototype firstDuplicate = firstConcretePrototype.duplicate();
        Prototype secondDuplicate = secondConcretePrototype.duplicate();
    }

}
