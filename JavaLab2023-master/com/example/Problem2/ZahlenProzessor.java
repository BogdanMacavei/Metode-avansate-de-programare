package com.example.Problem2;

public class ZahlenProzessor {

    public int maxZahl(int[] zahl) {

        int maxzahl = 0;

        for (int zahle : zahl) {
            if (zahle > maxzahl) {
                maxzahl = zahle;
            }
        }
        return maxzahl;
    }

    public int minZahl(int[] zahl) {

        int minzahl = zahl[0];

        for (int zahle : zahl) {
            if (zahle < minzahl) {
                minzahl = zahle;
            }
        }
        return minzahl;
    }

    public int maxSumme(int[] zahl) {
        int summ = 0;
        for(int zahle : zahl){
            summ = summ + zahle;
        }
        return summ - minZahl(zahl);
    }

    public int minSumme(int[] zahl){
        int summ = 0;
        for(int zahle : zahl){
            summ = summ + zahle;
        }
        return summ - maxZahl(zahl);
    }
}