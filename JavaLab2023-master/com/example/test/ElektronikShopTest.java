package com.example.test;

import com.example.Problem4.ElektronikShop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElektronikShopTest {

    @Test
    public void testBiligeTastatur() {
        ElektronikShop shop = new ElektronikShop();
        int[] tastaturPreise = {50, 30, 70, 20};
        int billigstesTastatur = shop.biligeTastatur(tastaturPreise);
        assertEquals(20, billigstesTastatur);
    }

    @Test
    public void testTeuersteUSB() {
        ElektronikShop shop = new ElektronikShop();
        int[] usbPreise = {40, 60, 80, 100};
        int budget = 75;
        int teuerstesUSB = shop.teuersteUSB(usbPreise, budget);
        assertEquals(60, teuerstesUSB);
    }

    @Test
    public void testTeuersteGegenstand() {
        ElektronikShop shop = new ElektronikShop();
        int[] tastaturPreise = {50, 30, 70, 20};
        int[] usbPreise = {40, 60, 80, 100};
        int teuersterGegenstand = shop.teuersteGegenstand(tastaturPreise, usbPreise);
        assertEquals(100, teuersterGegenstand);
    }

    @Test
    public void testTeuersteGegenstande() {
        ElektronikShop shop = new ElektronikShop();
        int[] tastaturPreise = {50, 30, 70, 20};
        int[] usbPreise = {40, 60, 80, 100};
        int budget = 100;
        int teuersterGegenstand = shop.teuersteGegenstande(tastaturPreise, usbPreise, budget);
        assertEquals(100, teuersterGegenstand);
    }

    @Test
    public void testBiligeTastaturWithUnexpeted() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] emptyArray = {};

        assertThrows(IllegalArgumentException.class, () -> {
            elektronikShop.biligeTastatur(emptyArray);
        });
    }

    @Test
    public void testTeuersteGegenstandWithUnexpeted() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tast = {};
        int[] usb = {};

        assertThrows(IllegalArgumentException.class, () -> {
            elektronikShop.teuersteGegenstand(tast, usb);
        });
    }

    @Test
    public void testTeuersteUSBWithInvalidBudget() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] usb = {50, 30, 70};
        int buget = -10;

        assertThrows(IllegalArgumentException.class, () -> {
            elektronikShop.teuersteUSB(usb, buget);
        });
    }


    @Test
    public void testTeuersteGegenstandeWithNoValidOption() {
        ElektronikShop elektronikShop = new ElektronikShop();
        int[] tast = {10, 20};
        int[] usb = {30, 40};
        int buget = 15;

        assertEquals(0, elektronikShop.teuersteGegenstande(tast, usb, buget));
    }
}

