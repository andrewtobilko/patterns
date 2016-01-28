package com.github.tobilko.creational.abstractfactory;

/**
 * Describes "abstract factory" pattern.
 * Provides a common interface for concrete implementations of factory.
 *
 * @author Andrew Tobilko
 *
 * @see Element
 * @see Product
 */
public interface AbstractFactory {

    /**
     * Describes a creation of an instance of {@code Product} type.
     *
     * @return a concrete instance of {@code Product} subclass
     */
    Product createProduct();

    /**
     * Describes a creation of an instance of {@code Element} type.
     *
     * @return a concrete instance of {@code Element} subclass
     */
    Element createElement();
}
