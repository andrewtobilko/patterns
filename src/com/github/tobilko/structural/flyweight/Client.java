package com.github.tobilko.structural.flyweight;

/**
 * Shows how a {@code FlyweightFactory} factory creates {@code Flyweight} instances.
 *
 * @author Andrew Tobilko
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight f1 = factory.get("f");
        Flyweight f2 = factory.get("f");
        Flyweight f3 = factory.get("f");

        Flyweight s1 = factory.get("s");
        Flyweight s2 = factory.get("s");
        Flyweight s3 = factory.get("s");

        // only two objects will be created
    }

}
