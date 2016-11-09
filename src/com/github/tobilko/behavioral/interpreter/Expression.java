package com.github.tobilko.behavioral.interpreter;

/**
 * An expression that gets interpreted by the given context.
 *
 * Created by Andrew Tobilko on 11/4/2016.
 *
 */
public interface Expression {

    Expression interpret(Context context);

}

