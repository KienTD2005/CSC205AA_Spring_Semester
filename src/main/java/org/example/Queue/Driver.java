package org.example.Queue;

public class Driver {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayListQueue<>();

        queue.offer("Hello");
        queue.offer("World");
        queue.offer("Howdy");

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
