package com.github.tobilko.structural.proxy;

/**
 * Presents a real remote machine that does an action by a command.
 *
 * Created by Andrew Tobilko on 11/1/2016.
 *
 */
public class RemoteMachine implements Machine {

    public void perform() {
        System.out.println("I'm running some stuff locally on my own.");
    }

}
