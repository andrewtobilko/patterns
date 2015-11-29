package com.tobilko.iterator;

/**
 *  Provides a method that shows a working of "iterator" pattern.
 *
 *  @author Andrew Tobilko
 *
 *  @see Array
 *  @see ArrayIterator
 *  @see Iterator
 */
public class Client {

    /**
     * Shows how to work "iterator" pattern. Creates an array, its iterator
     * and then iterates array elements.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Array<Integer> array = new Array<>(new Integer[]{1, 2, 3, 4, 5});
        ArrayIterator<Integer> iterator = array.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
