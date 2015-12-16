package com.tobilko.adapter;

/**
 * Describes the adapter software design pattern.
 * {@code Adapter} is used to unite system interface with client interface.
 *
 * @author Andrew Tobilko
 *
 * @see com.tobilko.adapter.Client
 * @see com.tobilko.adapter.Adaptee
 */
public class Adapter implements Client {

    /**
     *  Methods of {@code adaptee} are used to provide
     *  a functionality for {@code Adapter}'s methods.
     */
    private Adaptee adaptee;

    /**
     * Receives an object of {@code Adapter} interface and
     * saves it into the private class field {@code adaptee}.
     * @param adaptee the object of {@code Adaptee} interface
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * An example of method that shows how to unite
     * two different interfaces.
     */
    @Override
    public void method() {
        adaptee.method();
    }

}
