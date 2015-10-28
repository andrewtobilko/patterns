package com.tobilko.iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private E[] array;
    private int cursor = 0;

    public ArrayIterator(E[] array) {
        this.array = array;
    }

    @Override
    public E next() {
        return array[cursor++];
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length && array[cursor] != null;
    }

}
