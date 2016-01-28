package com.github.tobilko.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ComplexElement {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

}
