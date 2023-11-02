package com.example.Problem4;

public class ElektronikShop {
    public int biligeTastatur(int[] tast) {

        if (tast == null || tast.length == 0) {
            throw new IllegalArgumentException("No keyboards available.");
        }

        int rezultat = Integer.MAX_VALUE;
        for (int min : tast) {
            if (rezultat > min) {
                rezultat = min;
            }
        }
        return rezultat;
    }

    public int teuersteGegenstand(int[] tast, int[] usb) {

        if (tast == null || usb == null || tast.length == 0 || usb.length == 0) {
            throw new IllegalArgumentException("No keyboards or USB drives available.");
        }

        int rezultat = 0;
        int rez1 = 0;
        int rez2 = 0;
        for (int max : tast) {
            if (rez1 < max) {
                rez1 = max;
            }
        }
        for (int max : usb) {
            if (rez2 < max) {
                rez2 = max;
            }
        }
        if (rez1 > rez2) {
            rezultat = rez1;
        } else {
            rezultat = rez2;
        }
        return rezultat;
    }

    public int teuersteUSB(int[] usb, int buget) {

        if (usb == null || usb.length == 0 || buget <= 0) {
            throw new IllegalArgumentException("No USB drives available or invalid budget.");
        }

        int rezultat = 0;
        for (int max : usb) {

            if (rezultat < max && max <= buget) {
                rezultat = max;
            }
        }
        return rezultat;
    }

    public int teuersteGegenstande(int[] tast, int[] usb, int buget) {

        if (tast == null || usb == null || tast.length == 0 || usb.length == 0 || buget <= 0) {
            throw new IllegalArgumentException("No keyboards or USB drives available or invalid budget.");
        }

        int sum = 0;
        int rezultat = 0;
        for (int tastatur : tast) {
            for (int ub : usb) {
                sum = tastatur + ub;
                if (rezultat < sum && sum <= buget) {
                    rezultat = sum;
                }
            }
        }
        return rezultat;
    }
}
