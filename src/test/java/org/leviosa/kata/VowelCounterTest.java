package org.leviosa.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelCounterTest {
    @Test
    void getCount_noLetter_zero() {
        assertEquals(0, getVowelCounter().getCount(""));
    }

    @Test
    void getCount_noVowel_zero() {
        assertEquals(0, getVowelCounter().getCount("k"));
    }

    @Test
    void getCount_oneVowel_one() {
        assertEquals(1, getVowelCounter().getCount("e"));
    }

    @Test
    void getCount_twoVowels_two() {
        assertEquals(2, getVowelCounter().getCount("ae"));
    }

    @Test
    void getCount_oneVowelAndOneConsonant_one() {
        assertEquals(1, getVowelCounter().getCount("be"));
    }

    @Test
    void getCount_allAndOnlyVowels_five() {
        assertEquals(5, getVowelCounter().getCount("aeiou"));
    }

    private VowelCounter getVowelCounter() {
        return new VowelCounter();
    }
}