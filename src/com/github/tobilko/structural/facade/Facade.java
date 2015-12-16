package com.tobilko.facade;

import com.tobilko.facade.subsystem.FirstSystemClass;
import com.tobilko.facade.subsystem.SecondSystemClass;

public class Facade {

    private FirstSystemClass first;
    private SecondSystemClass second;

    public Facade(FirstSystemClass first, SecondSystemClass second) {
        this.first = first;
        this.second = second;
    }

    public void method() {
        first.method();
        second.method();
    }

    public static Facade getDefaultFacade() {
        return new Facade(new FirstSystemClass(), new SecondSystemClass());
    }

}
