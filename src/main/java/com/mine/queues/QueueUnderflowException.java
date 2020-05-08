package com.mine.queues;

public class QueueUnderflowException extends Exception {
    QueueUnderflowException() {
        super("Stack underflow exception.");
    }
}
