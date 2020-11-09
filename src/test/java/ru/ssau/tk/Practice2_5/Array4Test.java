package ru.ssau.tk.Practice2_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array4Test {

    @Test
    public void testMassif() {
        int[] arr = Array4.massif(5);
        assertEquals(arr[0], 0);
        assertEquals(arr[1], 1);
        assertEquals(arr[2], 1);
        assertEquals(arr[3], 2);
        assertEquals(arr[4], 3);
    }
}