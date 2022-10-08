package org.leviosa.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DnaComplementaryCreatorTest {
    @Test
    void makeComplement_T_returnA() {
        assertEquals("T", getCreator().makeComplement("A"));
    }

    @Test
    void makeComplement_A_returnT() {
        assertEquals("A", getCreator().makeComplement("T"));
    }

    @Test
    void makeComplement_TTTT_returnAAAA() {
        assertEquals("TTTT", getCreator().makeComplement("AAAA"));
    }

    @Test
    void makeComplement_TAACG_returnATTGC() {
        assertEquals("TAACG", getCreator().makeComplement("ATTGC"));
    }

    @Test
    void makeComplement_CATA_returnGTAT() {
        assertEquals("CATA", getCreator().makeComplement("GTAT"));
    }

    private DnaComplementaryCreator getCreator() {
        return new DnaComplementaryCreator();
    }
}