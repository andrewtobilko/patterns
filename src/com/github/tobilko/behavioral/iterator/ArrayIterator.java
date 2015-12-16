package com.tobilko.iterator;

/**
 *  A concrete implementation of "iterator" pattern for {@code Array}.
 *
 *  @param <E> type of elements through which iterator will pass
 *
 *  @author Andrew Tobilko
 *
 *  @see Array
 *  @see Iterator
 *  @see Client
 */
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
