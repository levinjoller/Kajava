package org.leviosa.kata;

import java.util.Arrays;

public class ParityOutlierFinder {
    public int find(int[] digits) {
        int[] evenDigits = Arrays.stream(digits).filter(digit -> digit % 2 == 0).toArray();
        if (evenDigits.length == 1) {
            return evenDigits[0];
        }
        return Arrays.stream(digits).filter(digit -> digit % 2 != 0).findFirst().orElseThrow();
    }
}
