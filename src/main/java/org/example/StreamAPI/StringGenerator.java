package org.example.StreamAPI;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    char[] letters =  "0123456789ABCDEF".toCharArray();
    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)]; // from a number to a given length exclusive.
    }
}
