package com.github.tobilko.creational.builder;

public class Client {

    public static void main(String[] args) {
        Builder<ComplexElement> builder = new ComplexElementBuilder(new ComplexElement());

        ComplexElement element = (ComplexElement) builder
                .buildPart(new Element())
                .buildPart(new Element())
                .buildPart(new Element())
        .build();
    }
}
