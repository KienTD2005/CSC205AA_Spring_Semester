package org.example.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        // anonymous function
        // x -> x * 2

        // Predicate - Takes 1 value and returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - Takes 1 value and return 1 value
        Function<Integer, Integer> function = x -> x * 2;

        // Supplier - Takes nothing and returns a value (single)
        Supplier<String> supplier = () -> "Hello Lambda!";

        // Consumer - Takes a value and returns nothing.
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


}
