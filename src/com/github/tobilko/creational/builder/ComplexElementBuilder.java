package com.github.tobilko.creational.builder;

public class ComplexElementBuilder implements Builder<ComplexElement> {

    private final ComplexElement complexElement;

    public ComplexElementBuilder(ComplexElement complexElement) {
        this.complexElement = complexElement;
    }

    @Override
    public Builder buildPart(Element element) {
        complexElement.addElement(element);
        return this;
    }

    @Override
    public ComplexElement build() {
        return complexElement;
    }

}
