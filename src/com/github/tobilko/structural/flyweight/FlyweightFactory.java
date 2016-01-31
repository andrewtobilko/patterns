package com.github.tobilko.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Produces new instances of {@code Flyweight} class
 * only in the case they don't exist in the pool (the {@code Hashmap} implementation).
 *
 * @author Andrew Tobilko
 */
public class FlyweightFactory {

    private Map<String, Flyweight> map = new HashMap<>();

    public Flyweight get(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(name);
            map.put(name, flyweight);

            return flyweight;
        }
    }

}
