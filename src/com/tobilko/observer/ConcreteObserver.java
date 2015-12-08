package com.tobilko.observer;

/**
 * Implements {@code Observer} interface.
 *
 * @author Andrew Tobilko
 *
 * @see Observable
 * @see Observer
 */
public class ConcreteObserver implements Observer {
    /**
     *
     * @param observable an object of {@code Observable} type,
     *                   represents an object which notifies about
     *                   some changes in it
     * @param data received information
     * @param <T> type of received information
     */
    @Override
    public <T> void update(Observable observable, T data) {
        if (observable instanceof ConcreteObservable) {
            System.out.println(data);
        }
    }
}
