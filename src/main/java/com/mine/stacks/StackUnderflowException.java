package com.mine.stacks;

public class StackUnderflowException extends Exception {
    StackUnderflowException() {
        super("Stack underflow exception.");
    }
}
