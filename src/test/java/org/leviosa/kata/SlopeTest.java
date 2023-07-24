package org.leviosa.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlopeTest {
    @Test
    void slope_noSlope_zero() {
        assertEquals("0", getSlope().slope(new int[]{19, 3, 20, 3}));
    }

    @Test
    void slope_divisionByZero_undefined() {
        assertEquals("undefined", getSlope().slope(new int[]{-7, 2, -7, 4}));
    }

    @Test
    void slope_ascendingSlope_positiveSlope() {
        assertEquals("5", getSlope().slope(new int[]{10, 50, 30, 150}));
    }

    @Test
    void slope_downwardSlope_negativeSlope() {
        assertEquals("-5", getSlope().slope(new int[]{15, 45, 12, 60}));
    }

    private Slope getSlope() {
        return new Slope();
    }
}