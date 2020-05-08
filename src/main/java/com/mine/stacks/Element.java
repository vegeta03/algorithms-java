package com.mine.stacks;

import lombok.Data;

@Data
public class Element<T> {
    private T data;
    private Element<T> next;

    public Element(T data, Element next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
