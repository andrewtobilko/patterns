package com.github.tobilko.structural.composite;

public class Client {

    public static void main(String[] args) {
        Element compositeElement = new CompositeElement();
        Element singleElement = new SingleElement();

        compositeElement.action();
        singleElement.action();
    }

}
