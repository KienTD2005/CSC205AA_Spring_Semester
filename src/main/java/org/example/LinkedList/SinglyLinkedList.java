package org.example.LinkedList;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{
    // what are our fields? They are nodes (use a specific name)
    private Node head; // make sure the nodes are correctly set up, as it
    // can possibly break the chain.
    private Node tail;


    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head); // Step 1 and 2
        // corner case for new list
        if (head == null){ // list is empty
            tail = node;
        }
        head = node; // Step 3
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null); // Step 1 and 2
        if (tail == null){
            tail = node;
            head = node;
        } else {
            tail.next = node; // Step 3
            tail = node; // Step 4
        }
    }

    @Override
    public E pollFirst() {
        E element;
        if (head == null) { // empty list
            element = null;
        } else {

            element = head.element; // 1

            if (head == tail){ // one node
                head = null;
                tail = null;
            } else {
                Node next = head.next; // 2
                head.next = null; // 3
                head = next; // 4
            }
        }


        return element;
    }

    @Override
    public E pollLast() {
        E element;
        if (head == null) { // empty list
            element = null; // 1
        } else {
            element = tail.element; // 1

            if (head == tail){ // one node
                head = null;
                tail = null;
            } else {
                Node current = head; // 2
                Node previous = head; // 2
                while (current.next != null){
                    previous = current;
                    current = current.next;
                }
                tail = previous; // 3
                tail.next = null; // 4
            }
        }
        return element;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while (current!= null){
            joiner.add(current.element.toString());
            current = current.next;
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }
    private class Node {
        Node next;
        E element;
        public Node(E element, Node next){
            this.element = element;
            this.next = next;
        }
    }
}
