package com.tobilko.templatemethod;

/**
 *  Describes an execution of algorithm with "Template method" pattern in it.
 *
 *  @author Andrew Tobilko
 *
 *  @see AbstractClass
 *  @see ConcreteClass
 */
public class Client {

    /**
     *  Creates object of {@code ConcreteClass} and
     *  executes a template method by using this object.
     *
     *  @param args  the command line arguments
     */
    public static void main(String[] args) {
        ConcreteClass object = new ConcreteClass();
        object.templateMethod();
    }
}
