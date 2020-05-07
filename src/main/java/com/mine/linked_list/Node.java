package com.mine.linked_list;

import lombok.Data;

@Data
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        setNext(null);
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
