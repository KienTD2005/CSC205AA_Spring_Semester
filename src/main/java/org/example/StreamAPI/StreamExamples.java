package org.example.StreamAPI;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;
/*
        // Intermediate operations

        // map
        List<Integer> square = numbers
                .stream() // monad : Self-contained operation
                .map(x -> x * x)
                .collect(Collectors.toList());
        square.forEach(System.out::println); // from a collection API.
        // filter
        List<String> result = names
                .stream() // monad : Self-contained operation
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        // sorted -- Not a Java thing.
        List<String> result2 = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);
        // terminal operations

        // collect -- Exclude a duplicate data
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        // forEach
        numbers
                .stream()
                .map(x -> x * x)
                .forEach(System.out::println); // Stream API
        numbers.forEach(System.out::println); // Collection API - Exists in List API
        // reduce -- Most complex and hardest to get around
        // not a java thing, it's a functional thing
        int sum = 0;
        for(int x = 1; x <= 5; x++){
            if (x % 2 == 0){ // Adding any number from 1 to 5 that are even numbers
                sum += x;
            }
        }
        System.out.println("Evem sum: " + sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("Even sum: " + evenSum);

        // int stream
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println("Total sum: " + totalSum);

        // random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);
*/
/*
        // IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement) // x = x + 1 -> getAndIncrement
                .limit(20)
                .filter(evenOnly)
                .forEach(System.out::println);
*/
        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(128)
                .collect(Collectors.joining()); // String concatenation
        System.out.println(randomString);
    }
}
