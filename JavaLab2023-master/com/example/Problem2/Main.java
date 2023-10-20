package com.example.Problem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZahlenProzessor zahlprozes = new ZahlenProzessor();

        int[] zahl = new int[]{1, 2, 23, 25, 79, 80, 85, 103, 1110};

        System.out.println("Die maximale Zahl ist: " + zahlprozes.maxZahl(zahl));

        System.out.println("Die minimale Zahl ist: " + zahlprozes.minZahl(zahl));

        System.out.println("Die maximale Summe ist: " + zahlprozes.maxSumme(zahl));

        System.out.println("Die maximale Summe ist: " + zahlprozes.minSumme(zahl));
    }
}