package org.example.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000))
                .boxed()
                .limit(100)
                .toArray(Integer[]::new);

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);
        Integer[] copy5 = copyArray(arr);

        System.out.println("\nSelection Sort...");
        long start = System.nanoTime();
        SortingUtility.selectionSort(copy1);
        long stop = System.nanoTime();
        printFirstTenOfArray(copy1);
        System.out.println("Time taken: " + (stop - start) / 1000000 + " ms");

        System.out.println("\nInsertion Sort...");
        start = System.nanoTime();
        SortingUtility.insertionSort(copy2);
        stop = System.nanoTime();
        printFirstTenOfArray(copy2);
        System.out.println("Time taken: " + (stop - start) + " ns");

        System.out.println("\nBubble Sort...");
        start = System.nanoTime();
        SortingUtility.bubbleSort(copy3);
        stop = System.nanoTime();
        printFirstTenOfArray(copy3);
        System.out.println("Time taken: " + (stop - start) + " ns");

        System.out.println("\nQuick Sort...");
        start = System.nanoTime();
        SortingUtility.quickSort(copy4);
        stop = System.nanoTime();
        printFirstTenOfArray(copy4);
        System.out.println("Time taken: " + (stop - start) + " ns");


        System.out.println("\nMerge Sort...");
        start = System.nanoTime();
        SortingUtility.mergeSort(copy5);
        stop = System.nanoTime();
        printFirstTenOfArray(copy5);
        System.out.println("Time taken: " + (stop - start) + " ns");


    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}