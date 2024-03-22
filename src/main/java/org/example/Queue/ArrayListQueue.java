package org.example.Queue;

import java.util.*;

public class ArrayListQueue<E> implements Queue<E> {
    List<E> queue;

    private static final Integer FRONT_OF_QUEUE = 0;
    public ArrayListQueue() {
        this.queue = new ArrayList<>();
    }


    @Override
    public boolean offer(E e) {
        return this.queue.add(e);
    }

    @Override
    public E poll() {
        return this.queue.removeFirst();
    }

    @Override
    public E peek() {
        return this.queue.get(FRONT_OF_QUEUE);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(queue);
        return sb.toString();
    }
}
