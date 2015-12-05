package com.tobilko.observer;

public class Client {
    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();
        Observer observer = new ConcreteObserver();

        observable.addObserver(observer);

        observable.setChanged();
        observable.notifyAllObservers();
    }
}
