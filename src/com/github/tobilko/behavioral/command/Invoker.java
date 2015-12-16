package com.tobilko.command;

/**
 * Manages execution of {@code Command} objects.
 */
public class Invoker {

    /**
     * Executes {@code execute} method of the received object (shown as simple example)
     * @param command the implementation of {@code Command} interface.
     */
    public void executeCommandMethod(Command command) {
       command.execute();
    }
}
