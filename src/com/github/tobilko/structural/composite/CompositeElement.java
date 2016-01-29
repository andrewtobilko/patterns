package com.github.tobilko.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement extends Element {

    List<Element> elements = new ArrayList<>();

    @Override
    public void action() { elements.forEach(Element::action); }

}
