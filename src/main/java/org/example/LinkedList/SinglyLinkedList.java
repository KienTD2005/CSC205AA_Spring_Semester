package org.example.LinkedList;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{
    // what are our fields? They are nodes (use a specific name)
    private Node head; // make sure the nodes are correctly set up, as it
    // can possibly break the chain.
    private Node tail;


    // O(1)
    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head); // Step 1 and 2
        // corner case for new list
        if (head == null){ // list is empty
            head = node;
            tail = head;
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

    // O(1)
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

    // O(n)
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

    // O(1)
    @Override
    public E peekFirst() {
        return head.element;
    }

    // O(1)
    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {
        Node current = head;
        while (current.next != null) { // O(n)
            Node next = current.next;
            current.next = null;
            current = next;
        }

        head = null;
        tail = null;

    }

    @Override
    public boolean contains(E element) {

        boolean contains = false;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            if (current.element == element) {
                contains = true;
                break;
            }
            current = next;
        }
        return contains;
    }

    // O(n)
    public int size() {

        int counter = 0;
        if (head != null) {

            if (head == tail) {
                counter = 1;
            } else {
                Node current = head;
                while (current != null) {
                    counter++;
                    current = current.next;
                }
            }
        }
        return counter;
    }

    // O(n)
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
    // O(1) - creating a new class
    private class Node {
        Node next;
        E element;
        public Node(E element, Node next){
            this.element = element;
            this.next = next;
        }
    }
}
