package com.example.main;

public class NotenProzessor {

    public int[] nichtAusreichendeNoten(int[] note) {

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) < 38) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }

    public int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public double berechneDurchschnitt(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }

        int summe = 0;
        for (int note : noten) {
            summe += note;
        }

        return (double) summe / noten.length;
    }

    public int[] abgerundeteNoten(int[] noten) {

        int[] finaleNoten = new int[0];

        for (int i = 0; i < noten.length; i++) {
            if (round(noten[i]) >= 40) {
                finaleNoten = addToArray(finaleNoten, round(noten[i]));
            }
        }
        return finaleNoten;
    }

    public int abgerundeteMaxNote(int[] noten) {

        int maxAbgNote = 0;

        for (int note : noten) {
            int abgerundeteNote = round(note);
            if (abgerundeteNote > maxAbgNote) {
                maxAbgNote = abgerundeteNote;
            }
        }

        return maxAbgNote;

    }

}