package com.github.tobilko.creational.abstractfactory;

/**
 *  Shows how to work the abstract factory pattern and
 *  illustrates a creation instances of varying types
 *  by a concrete factory.
 *
 *  @author Andrew Tobilko
 *
 *  @see AbstractFactory
 *  @see ConcreteFactory
 */
public class Client {

    /**
     *  Shows the example of work "abstract factory" pattern.
     *
     *  @param args console-line arguments
     */
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        Element element = factory.createElement();
        Product product = factory.createProduct();
    }
}
