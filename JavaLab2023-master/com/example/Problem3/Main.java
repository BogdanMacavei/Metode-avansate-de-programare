package com.example.Problem3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arraydarstelung arrdar = new Arraydarstelung();

        int[] num1 = new int[]{1, 6, 0, 0, 5};

        int[] num2 = new int[]{0, 5, 0, 0, 3};

        int nummer = 3;

        System.out.println("Summe der zwei Arrays ist: " + Arrays.toString(arrdar.summe(num1, num2)));

        System.out.println("Die Differenz der zwei ist: " + Arrays.toString(arrdar.diff(num1, num2)));

        System.out.println("Die Multiplikation ist: " + Arrays.toString(arrdar.multi(num1, nummer)));

        System.out.println("Die Division ist: " + Arrays.toString(arrdar.div(num1, nummer)));
    }
}
