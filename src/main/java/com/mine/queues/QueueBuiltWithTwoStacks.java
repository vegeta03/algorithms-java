package com.mine.queues;

import com.mine.stacks.Stack;
import com.mine.stacks.StackOverflowException;
import com.mine.stacks.StackUnderflowException;

public class QueueBuiltWithTwoStacks<T> {
    private Stack<T> forwardStack = new Stack<>();
    private Stack<T> reverseStack = new Stack<>();

    public QueueBuiltWithTwoStacks() {
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException();
        }

        try {
            if (forwardStack.isEmpty()) {
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop());
                }
            }
            forwardStack.push(data);
        } catch (StackOverflowException | StackUnderflowException se) {
            throw new QueueOverflowException();
        }
    }

    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }

        try {
            if (reverseStack.isEmpty()) {
                while (!forwardStack.isEmpty()) {
                    reverseStack.push(forwardStack.pop());
                }
            }
            return reverseStack.pop();
        } catch (StackOverflowException | StackUnderflowException se) {
            throw new QueueUnderflowException();
        }
    }

    public boolean isFull() {
        return forwardStack.isFull() || reverseStack.isFull();
    }

    public boolean isEmpty() {
        return forwardStack.isEmpty() || reverseStack.isEmpty();
    }
}
