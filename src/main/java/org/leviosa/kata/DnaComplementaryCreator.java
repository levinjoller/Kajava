package org.leviosa.kata;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class DnaComplementaryCreator {
    private static final Map<String, String> DNA_MAP = Map.ofEntries(
            entry("A", "T"),
            entry("T", "A"),
            entry("C", "G"),
            entry("G", "C"));

    public String makeComplement(String dna) {
        return Arrays.stream(dna.split("(?!^)")).map(DNA_MAP::get).collect(Collectors.joining());
    }
}
