package com.tobilko.adapter;

public class Adapter implements Client {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method() {
        adaptee.method();
    }

}
