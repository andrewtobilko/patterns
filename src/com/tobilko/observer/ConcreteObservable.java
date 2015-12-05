package com.tobilko.observer;

import java.util.Collection;
import java.util.HashSet;

public class ConcreteObservable implements Observable {
    private Collection<Observer> observers;
    private boolean state;

    public ConcreteObservable() {
        observers = new HashSet<>();
        state = false;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        if (state) {
            for (Observer o : observers) {
                o.update(this);
            }
            state = false;
        }
    }

    @Override
    public void setChanged() {
        state = true;
    }
}
