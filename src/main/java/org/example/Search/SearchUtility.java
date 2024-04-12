package org.example.Search;

import java.util.Arrays;
import java.util.List;

public class SearchUtility {
    public static void main(String[] args){

        int [] intArray = {2, 4, 6, 5, 3, 1, -2, -1, 0};

        int [] integerArray = Arrays.stream(intArray)
                .sorted()
                .toArray();

        Arrays.stream(integerArray).forEach(n -> System.out.print(n + " "));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 12));

        System.out.println(binarySearchIterative(integerArray, 1));
        System.out.println(binarySearchIterative(integerArray, 12));
    }

    /**
     * Linear search
     *
     * @param array
     * @param targetValue
     * @return Interger.MIN_VALUE if not found
     */
    public static int linearSearch(int[] array, int targetValue){

        int found = Integer.MIN_VALUE;
        for (int i : array) { // : is for each.
            if (i == targetValue){
                found = targetValue;
                break;
            }
        }

        return found;
    }

    /**
     * Search for objects
     * @param objectList
     * @param target
     * @return null if not found
     * @param <T>
     */
    public static <T> T linearSearch (List<T> objectList, T target){
        T result = null;
        if (objectList.contains(target)){ // O(n)
            result = objectList.get(objectList.indexOf(target)); // O(n)
        }

        return result; // return the target
    }

    public static <T extends Comparable<T>> boolean linearSearch (T[] array, T target){

        boolean found = false;
        for (T t : array){
            if (t.compareTo(target) == 0){
                found = true;
                break;
            }
        }

        return found;
    }

    public static int binarySearchIterative(int[] array, int targetValue){

        int min = 0;
        int max = array.length - 1;
        while (min <= max){
            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue){
                return mid;
            } else if (array[mid] < targetValue){
                min = mid + 1;
            } else { // array[mid] > targetValue
                max = mid - 1;
            }
        }
        return -1; // convention dictates we return -1 if not found
    }
}
