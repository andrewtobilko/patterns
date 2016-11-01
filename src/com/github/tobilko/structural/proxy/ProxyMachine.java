package com.github.tobilko.structural.proxy;

/**
 * Illustrates the proxy class over the `RemoteMachine` class that
 * checks particular rights to perform an action.
 *
 * Created by Andrew Tobilko on 11/1/2016.
 *
 */
public class ProxyMachine implements Machine {

    private boolean isAllowed;
    private Machine machine = new RemoteMachine();

    public ProxyMachine(boolean rights) {
        isAllowed = rights;
    }

    public void perform() {
        if (isAllowed) { // simulates access rights
            machine.perform();
        } else {
            // a normal type of runtime exception should be thrown
            throw new RuntimeException("Probably, you are not allowed to perform this kind of operations.");
        }
    }

}
