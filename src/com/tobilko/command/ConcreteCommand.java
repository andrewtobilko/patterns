package com.tobilko.command;

/**
 *  The implementation of {@code Command} interface.
 */
public class ConcreteCommand implements Command {
    /**
     *  Methods of this object will have been encapsulated.
     */
    private Receiver receiver;

    /**
     * Gets a object of {@code Receiver} class and saves it in the private class field.
     * @param receiver the object of {@code Receiver} class
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     *  Method that implements a basic command logic.
     */
    @Override
    public void execute() {}

}
