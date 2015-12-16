package com.tobilko.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = Facade.getDefaultFacade();
        facade.method();
    }

}
