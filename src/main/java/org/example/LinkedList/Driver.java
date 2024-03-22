package org.example.LinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new SinglyLinkedList<>();

        linkedlist.addFirst("first");
        linkedlist.addFirst("second");
        linkedlist.addFirst("third");
        linkedlist.addFirst("fourth");
        linkedlist.addFirst("fifth");

        linkedlist.addLast("sixth");
        linkedlist.addLast("seventh");
        linkedlist.addLast("eighth");


        System.out.println(linkedlist);

        linkedlist.pollFirst();

        System.out.println(linkedlist);

        linkedlist.pollFirst();
        linkedlist.pollFirst();
        linkedlist.pollFirst();
        linkedlist.pollFirst();
        linkedlist.pollFirst();
        System.out.println(linkedlist.pollFirst());
        System.out.println(linkedlist.pollFirst());


        System.out.println(linkedlist);

    }
}
