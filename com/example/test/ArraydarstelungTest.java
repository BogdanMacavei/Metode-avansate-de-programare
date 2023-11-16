package com.example.test;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import com.example.Problem3.Arraydarstelung ;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArraydarstelungTest {

    @Test
    public void testSumme() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int[] result = arraydarstelung.summe(num1, num2);
        int[] expected = {5, 7, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDiff() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {4, 5, 6};
        int[] num2 = {1, 2, 3};
        int[] result = arraydarstelung.dif(num1, num2);
        int[] expected = {3, 3, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testMulti() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {1, 2, 3};
        int num2 = 2;
        int[] result = arraydarstelung.multi(num1, num2);
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDiv() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {4, 5, 4};
        int num2 = 2;
        int[] result = arraydarstelung.div(num1, num2);
        int[] expected = {2, 2, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSummeWithUnexpeted() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = null;
        int[] num2 = {1, 2, 3};

        assertThrows(IllegalArgumentException.class, () -> {
            arraydarstelung.summe(num1, num2);
        });
    }

    @Test
    public void testBerechneDifferenzWithNullInput() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = null;
        int[] num2 = {1, 2, 3};

        assertThrows(IllegalArgumentException.class, () -> {
            arraydarstelung.dif(num1, num2);
        });
    }


    @Test
    public void testMultiWithUnexpeted() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {1, 2, 3};
        int num2 = 15;

        assertThrows(IllegalArgumentException.class, () -> {
            arraydarstelung.multi(num1, num2);
        });
    }

    @Test
    public void testDivWithUnexpeted() {
        Arraydarstelung arraydarstelung = new Arraydarstelung();
        int[] num1 = {1, 2, 3};
        int num2 = 0;

        assertThrows(IllegalArgumentException.class, () -> {
            arraydarstelung.div(num1, num2);
        });
    }

}
