package com.example.test;

import com.example.Problem2.ZahlenProzessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZahlProzessorTest {

    @Test
    public void testMaxZahl() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] zahlen = {4, 8, 3, 10, 17};

        int expected = 17;
        int result = zahlenProzessor.maxZahl(zahlen);

        assertEquals(expected, result);
    }

    @Test
    public void testMinZahl() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] zahlen = {4, 8, 3, 10, 17};

        int expected = 3;
        int result = zahlenProzessor.minZahl(zahlen);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxSumme() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] zahlen = {4, 8, 3, 10, 17};

        int expected = 39;
        int result = zahlenProzessor.maxSumme(zahlen);

        assertEquals(expected, result);
    }

    @Test
    public void testMinSumme() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] zahlen = {4, 8, 3, 10, 17};

        int expected = 25;
        int result = zahlenProzessor.minSumme(zahlen);

        assertEquals(expected, result);
    }

    @Test
    public void testMaxZahlWithUnexpeted() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] emptyArray = {};

        assertThrows(IllegalArgumentException.class, () -> {
            zahlenProzessor.maxZahl(emptyArray);
        });
    }

    @Test
    public void testMinZahlWithUnexpeted() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] nullArray = null;

        assertThrows(IllegalArgumentException.class, () -> {
            zahlenProzessor.minZahl(nullArray);
        });
    }

    @Test
    public void testMaxSummeWithUnexpeted() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] emptyArray = {};

        assertThrows(IllegalArgumentException.class, () -> {
            zahlenProzessor.maxSumme(emptyArray);
        });
    }

    @Test
    public void testMinSummeWithUnexpeted() {
        ZahlenProzessor zahlenProzessor = new ZahlenProzessor();
        int[] nullArray = null;

        assertThrows(IllegalArgumentException.class, () -> {
            zahlenProzessor.minSumme(nullArray);
        });
    }

}

