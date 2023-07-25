package org.leviosa.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParityOutlierFinderTest {
    @Test
    void find_oneOddNumber_returnOddNumber() {
        assertEquals(3, getParityOutlierFinder().find(new int[]{2, 6, 8, -10, 3}));
    }

    @Test
    void find_oneEvenNumber_returnEvenNumber() {
        int[] digits = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        assertEquals(206847684, getParityOutlierFinder().find(digits));
    }

    @Test
    void find_zeroAsEvenNumber_returnZero() {
        assertEquals(0, getParityOutlierFinder().find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    private ParityOutlierFinder getParityOutlierFinder() {
        return new ParityOutlierFinder();
    }
}