package com.mine.stacks_and_queues;

import lombok.Data;

@Data
public class Stack<T> {
    private static int MAX_SIZE = 40;

    private Element<T> top;
    private int size = 0;

    public void push(T data) throws StackOverflowException {
        if (size == MAX_SIZE) {
            throw new StackOverflowException();
        }

        Element<T> element = new Element<T>(data, top);
        top = element;
        size++;
    }

    public T pop() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        }

        T data = top.getData();
        top.setData(null);
        top = top.getNext();

        size--;

        return data;
    }

    public T peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        }

        return top.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }
}
