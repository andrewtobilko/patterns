package com.tobilko.abstractfactory;

/**
 *
 *
 *  @author Andrew Tobilko
 */
public class ConcreteFactory implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }

    @Override
    public Element createElement() {
        return new ConcreteElement();
    }
}
