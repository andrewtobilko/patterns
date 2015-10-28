package com.tobilko.iterator;

public class Array<E> {

    private E[] elements;

    public Array(E[] elements) {
        this.elements = elements;
    }

    public ArrayIterator<E> createIterator() {
        return new ArrayIterator<>(elements);
    }

}
