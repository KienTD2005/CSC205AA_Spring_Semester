package org.example.BigO;

import java.util.ArrayList;
import java.util.List;

public class Performance {
    public static void main(String[] args) {

        // Example of O(1)
        System.out.println("one");

        // Example of Product Big-O notation.
        // O(1) + O(1) = O(1)


        // O(n) - linear example

        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        // O(n)
        myList.forEach(System.out::println);

        // O(n^2) - polynomial example
        for(int x = 0; x < myList.size(); x++) { // O(n)
            for (int y = 0; y <= 10; y++){ // O(n)
                System.out.println(x + ": "+ y); // O(1) - Constant
            }
        }

        // O(n) * O(n) * O(1) = O(n^2) * O(1) = 1 * O(n^2) = O(n^2)

        // O(n)
        for (int n = 0; n <= 10000; n++){
            // O(1)
        }
    }
}
