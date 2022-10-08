package org.leviosa.kata;

import java.util.Arrays;
import java.util.Set;

public class VowelCounter {
    private static final Set<String> VOWELS = Set.of("a", "e", "i", "o", "u");

    public int getCount(String str) {
        return (int) Arrays.stream(str.split("(?!^)")).filter(VOWELS::contains).count();
    }
}
