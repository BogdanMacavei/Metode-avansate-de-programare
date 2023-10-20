package com.example.test;

import com.example.Problem2.ZahlenProzessor;

public class TestRunner {
    public static void main(String[] args) {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();

        notenProzessorTest.addToArrayTest();

        notenProzessorTest.testBerechneDurchschnittWithNonEmptyArray();

        notenProzessorTest.testBerechneDurchschnitt();

        notenProzessorTest.testAbgerundeteNoten();

        notenProzessorTest.testAbgerundeteMaxNote();

        ZahlProzessorTest zahlTest = new ZahlProzessorTest();

        zahlTest.testMaxZahl();

        zahlTest.testMinZahl();

        zahlTest.testMaxSumme();

        zahlTest.testMinSumme();
    }
}
