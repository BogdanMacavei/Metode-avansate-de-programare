package com.example.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[]{10, 20, 30, 39, 47, 48, 60};

        System.out.println("Noten die nicht uber 38 sind: " + Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        double averageGrade = notenProzessor.berechneDurchschnitt(noten);
        int abgMaxNote = notenProzessor.abgerundeteMaxNote(noten);

        System.out.println("Durchschnittsnote aller Noten: " + averageGrade);

        System.out.println("Die abgerundete Noten sidnd: " + Arrays.toString(notenProzessor.abgerundeteNoten(noten)));

        System.out.println("Die maximale abgerundete Note ist: " + abgMaxNote);

    }
}
