package com.tobilko.decorator;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
        // adding other functionality
    }
}
