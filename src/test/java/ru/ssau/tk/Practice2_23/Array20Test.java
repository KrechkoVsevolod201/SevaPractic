package ru.ssau.tk.Practice2_23;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array20Test {

    @Test
    public void testArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Array20.Array(arr);
        assertEquals(arr[0], 5);
        assertEquals(arr[4], 1);
    }
}