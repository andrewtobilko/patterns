package com.github.tobilko.structural.proxy;

/**
 * Shows the `proxy` pattern in action.
 * That's a bright example of a remote proxy pattern.
 *
 * Created by Andrew Tobilko on 11/1/2016.
 *
 */
public class Client {

    public static void main(String[] args) {

        Machine machine = new ProxyMachine(false);
        machine.perform();

    }

}
