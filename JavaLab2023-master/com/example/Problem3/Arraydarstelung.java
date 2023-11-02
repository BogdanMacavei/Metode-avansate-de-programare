package com.example.Problem3;


public class Arraydarstelung {

    public int[] summe(int[] num1, int[] num2) {

        if (num1 == null || num2 == null || num1.length != num2.length) {
            throw new IllegalArgumentException("Invalid input arrays for addition.");
        }

        int n = num1.length;
        int carr = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carr;
            result[i] = sum % 10;
            carr = sum / 10;
        }
        if (carr > 0) {
            result = handleCar(result, carr);
        }
        return result;
    }

    private static int[] handleCar(int[] result, int carry) {
        int n = result.length;
        int[] newResult = new int[n + 1];
        newResult[0] = carry;
        System.arraycopy(result, 0, newResult, 1, n);
        return newResult;
    }

    public int[] dif(int[] num1, int[] num2) {

        if (num1 == null || num2 == null || num1.length != num2.length) {
            throw new IllegalArgumentException("Ungültige Eingabe: Arrays müssen gleich lang sein.");
        }

        int n = num1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - carry;
            if (diff < 0) {
                diff += 10;
                carry = 1;
            } else {
                carry = 0;
            }
            result[i] = diff;
        }

        if (carry != 0) {
            throw new IllegalArgumentException("Ungültige Eingabe: Die zweite Zahl ist größer als die erste.");
        }

        return result;
    }

    public int[] multi(int[] num1, int num2) {

        if (num1 == null || num1.length == 0 || num2 < 0 || num2 > 9) {
            throw new IllegalArgumentException("Invalid input for multiplication.");
        }

        int n = num1.length;
        int carr = 0;
        int[] resultat = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int mul = num1[i] * num2 + carr;
            resultat[i] = mul % 10;
            carr = mul / 10;
        }
        if (carr > 0) {
            resultat = handleCar(resultat, carr);
        }
        return resultat;
    }

    public int[] div(int[] num1, int num2){

        if (num1 == null || num1.length == 0 || num2 <= 0 || num2 > 9) {
            throw new IllegalArgumentException("Invalid input for division.");
        }

        int n = num1.length;
        int carr = 0;
        int[] resultat = new int[n];
        for (int i = 0; i < n; i++){
            int div = num1[i] + carr *10;
            resultat[i] = div / num2;
            carr = div % num2;
        }
        return resultat;
    }
}
