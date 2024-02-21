package org.example.Collections;

import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Howdy");
        set.add("Hi");
        set.add("Hola");
        set.add("Ollo");
        // set.add(null);

        // System.out.println(set.contains("Hi"));
        // set.forEach(System.out::println);

        List<String> list = new Vector<>();
        list.add("Hello");
        list.add("Howdy");
        list.add("Hi");
        list.add("Hola");
        list.add("Ollo");

        // list.forEach(System.out::println);

        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("Howdy");
        queue.add("Hi");
        queue.add("Hola");
        queue.add("Ollo");

        /*System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
        */

        Deque<String> deque = new LinkedList<>();

        deque.add("Hello");
        deque.add("Howdy");
        deque.add("Hi");
        deque.add("Hola");
        deque.add("Ollo");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Hello");
        priorityQueue.add("Howdy");
        priorityQueue.add("Hi");
        priorityQueue.add("Hola");
        priorityQueue.add("Ollo");

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}
