package com.tobilko.command;

/**
 * Manages creation of {@code Receiver}, {@code Command}, {@code Invoker} objects.
 */
public class Client {

    /**
     * @param args the parameters have been received since the program start
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        new Invoker().executeCommandMethod(command);
    }

}
