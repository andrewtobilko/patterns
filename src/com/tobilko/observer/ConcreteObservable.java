package com.tobilko.observer;

import java.util.Collection;
import java.util.HashSet;

/**
 * Implements {@code Observable} interface. If a state of
 * object changes, all subscribers will receive an updated information.
 *
 * @author Andrew Tobilko
 * @see Observable
 * @see Observer
 */
public class ConcreteObservable implements Observable {
    /**
     * A collection of observers which want to get an updated information.
     */
    private Collection<Observer> observers;

    /**
     * It is responsible for changes of object.
     */
    private boolean state;

    /**
     * Initializes {@code observers} and {@code state} fields.
     */
    public ConcreteObservable() {
        observers = new HashSet<>();
        state = false;
    }

    /**
     *
     * @param observer an object of {@code Observer} that want to know
     */
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
                o.update(this, "data");
            }
            state = false;
        }
    }

    @Override
    public void setChanged() {
        state = true;
    }
}
