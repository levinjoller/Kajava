package org.leviosa.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearsTest {
    @Test
    void isLeapYear_leapYearDividableBy4_true() {
        assertTrue(getLeapYears().isLeapYear(2020));
    }

    @Test
    void isLeapYear_leapYearDividableBy400_true() {
        assertTrue(getLeapYears().isLeapYear(2000));
    }

    @Test
    void isLeapYear_noLeapYearDividableBy100_false() {
        assertFalse(getLeapYears().isLeapYear(2100));
    }

    @Test
    void isLeapYear_noLeapYear_false() {
        assertFalse(getLeapYears().isLeapYear(2015));
    }

    LeapYears getLeapYears() {
        return new LeapYears();
    }
}