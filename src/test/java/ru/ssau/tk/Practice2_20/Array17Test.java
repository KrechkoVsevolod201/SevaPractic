package ru.ssau.tk.Practice2_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array17Test {

    @Test
    public void testArray() {
        int[] array = new int[]{1, 4, 8, 9, 15};
        assertTrue(Array17.Array(array));
        int[] array1 = new int[]{18, 17, 14, 5, 1};
        assertFalse(Array17.Array(array1));
    }
}