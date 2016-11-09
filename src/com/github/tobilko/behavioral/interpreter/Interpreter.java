package com.github.tobilko.behavioral.interpreter;

/**
 * Illustrates the `interpreter` pattern (created an expression and
 * evaluated that by the context).
 *
 * Created by Andrew Tobilko on 11/3/2016.
 *
 */
public class Interpreter {

    public static void main(String[] args) {

        Expression expression = new TerminalExpression();
        expression.interpret(new Context());

    }

}
