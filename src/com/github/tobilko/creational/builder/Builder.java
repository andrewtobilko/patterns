package com.github.tobilko.creational.builder;

public interface Builder<T> {

    Builder buildPart(Element element);

    T build();

}
