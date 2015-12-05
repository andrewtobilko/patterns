package com.tobilko.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ConcreteObservable) {
            System.out.println(observable);
        }
    }
}
