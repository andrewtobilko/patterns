package com.tobilko.factorymethod;

/**
 *  Provides method that shows a working of "factory method" pattern.
 *
 *  @author Andrew Tobilko
 */
public class Client {
    /**
     *  Shows a working of "factory method" pattern.
     *
     *  @param args command-line arguments
     */
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Element element = creator.create();
    }
}
