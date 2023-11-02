package com.example.Problem4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElektronikShop es = new ElektronikShop();

        int[] tastatur = new int[]{81, 15, 28, 75, 20};

        int[] usb = new int[]{77, 98, 21, 45, 17};

        int budget = 50;

        System.out.println("Die billige Tastarur ist: " + es.biligeTastatur(tastatur));

        System.out.println("Der teuerste Gegenstand ist: " + es.teuersteGegenstand(tastatur, usb));

        System.out.println("Das teuerste UBS dass Markus kaufen kann ist: " + es.teuersteUSB(usb,budget));

        System.out.println("Die zwei Gegenstande die Markus kaufen kann ist: " + es.teuersteGegenstande(tastatur, usb, budget));
    }
}