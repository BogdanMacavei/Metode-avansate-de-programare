package com.example.Problem2;

public class ZahlenProzessor {

    public int maxZahl(int[] zahl) {

        if (zahl == null || zahl.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int maxzahl = 0;

        for (int zahle : zahl) {
            if (zahle > maxzahl) {
                maxzahl = zahle;
            }
        }
        return maxzahl;
    }

    public int minZahl(int[] zahl) {

        if (zahl == null || zahl.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int minzahl = zahl[0];

        for (int zahle : zahl) {
            if (zahle < minzahl) {
                minzahl = zahle;
            }
        }
        return minzahl;
    }

    public int maxSumme(int[] zahl) {

        if (zahl == null || zahl.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int summ = 0;
        for(int zahle : zahl){
            summ = summ + zahle;
        }
        return summ - minZahl(zahl);
    }

    public int minSumme(int[] zahl){

        if (zahl == null || zahl.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int summ = 0;
        for(int zahle : zahl){
            summ = summ + zahle;
        }
        return summ - maxZahl(zahl);
    }
}