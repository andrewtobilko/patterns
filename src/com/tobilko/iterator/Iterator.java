package com.tobilko.iterator;

/**
 *  Provides an interface for iterate elements of some structure
 *  and hides the implementation of this iteration.
 *
 *  @param <E> type of elements through which iterator will pass
 *
 *  @author Andrew Tobilko
 *
 *  @see Array
 *  @see ArrayIterator
 *  @see Iterator
 */
public interface Iterator<E> {
    /**
     *  Gives the next element of structure if it is possible.
     *
     *  @return the next element if it exists
     */
    E next();

    /**
     *  Checks whether the next element exists.
     *
     *  @return {code true} if the next element exists,
     *  otherwise returns {@code false}
     */
    boolean hasNext();

}
