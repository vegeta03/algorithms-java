package com.mine.queues;

public class QueueOverflowException extends Exception {

    public QueueOverflowException() {
        super("Stack overflow exception.");
    }
}
