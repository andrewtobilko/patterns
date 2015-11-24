package com.tobilko.simplefactory;

/**
 * Provides {@code Client} that shows how to work {@code SimpleFactory}.
 *
 * @author Andrew Tobilko
 */
public class Client {
    private SimpleFactory factory;

    public Client(SimpleFactory factory) {
        this.factory = factory;
    }

    public Interface getConcreteInstance(boolean condition) {
        return factory.createConcreteInstance(condition);
    }

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Client client = new Client(factory);

        Interface instance = client.getConcreteInstance(true);
        instance.execute();
    }
}
