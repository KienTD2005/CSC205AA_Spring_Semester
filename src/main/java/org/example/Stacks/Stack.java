package org.example.Stacks;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    void push(E item);
    int search(E element);
}
