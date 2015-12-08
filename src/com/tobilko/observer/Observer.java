package com.tobilko.observer;

/**
 *
 */
public interface Observer {
    <T> void update(Observable observable, T data);
}
