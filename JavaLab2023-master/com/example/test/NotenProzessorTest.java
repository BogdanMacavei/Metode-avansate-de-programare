package com.example.test;

import java.util.ArrayList;

import com.example.main.NotenProzessor;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    public void addToArrayTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[]{10, 20, 30};
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[2] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

    }

    public void testBerechneDurchschnittWithNonEmptyArray() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] grades = {80, 65, 90, 75, 88};

        double result = notenProzessor.berechneDurchschnitt(grades);

        assertTrue(Math.abs(result - 79.6) < 0.01);
    }

    @Test
    public void testBerechneDurchschnitt() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {80, 90, 70, 85, 92};

        double expected = 83.4;
        double result = notenProzessor.berechneDurchschnitt(noten);

        assertEquals(expected, result, 0.01);
    }


    @Test
    public void testAbgerundeteNoten() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {37, 42, 53, 48, 55};

        int[] expected = {42, 55, 50, 55};
        int[] result = notenProzessor.abgerundeteNoten(noten);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testAbgerundeteMaxNote() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = {45, 37, 53, 48, 58};

        int expected = 60;
        int result = notenProzessor.abgerundeteMaxNote(noten);

        assertEquals(expected, result);
    }

    @Test
    public void testNichtAusreichendeNotenUnexpeted() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] invalidNoten = { 105, -5, 75 }; // Invalid noten

        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.nichtAusreichendeNoten(invalidNoten);
        });
    }

    @Test
    public void testBerechneDurchschnittUnexpeted() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] emptyNoten = {};

        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.berechneDurchschnitt(emptyNoten);
        });
    }

    @Test
    public void testAbgerundeteMaxNoteUnexpeted() {
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] emptyNoten = {};

        assertThrows(IllegalArgumentException.class, () -> {
            notenProzessor.abgerundeteMaxNote(emptyNoten);
        });
    }

}