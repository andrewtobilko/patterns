package com.github.tobilko.behavioral.interpreter;

/**
 *
 * Created by Andrew Tobilko on 11/4/2016.
 *
 */
public class TerminalExpression implements Expression {

    public Expression interpret(Context context) {
        return this;
    }

}
