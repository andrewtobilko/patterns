package com.tobilko.iterator;

/**
 *  An example of a wrapper-class over an array.
 *
 *  @param <E> type of array elements
 *
 *  @author Andrew Tobilko
 *
 *  @see ArrayIterator
 *  @see Client
 *  @see Iterator
 */
public class Array<E> {

    /**
     * A storage of elements.
     */
    private E[] elements;

    /**
     *  A public constructor that initializes an object by using input parameters.
     *
     *  @param elements elements that will be saved into array
     */
    public Array(E[] elements) {
        this.elements = elements;
    }

    /**
     *  Creates an instance of iterator and returns it.
     *
     *  @return new {@code ArrayIterator} instance
     */
    public ArrayIterator<E> createIterator() {
        return new ArrayIterator<>(elements);
    }

}
