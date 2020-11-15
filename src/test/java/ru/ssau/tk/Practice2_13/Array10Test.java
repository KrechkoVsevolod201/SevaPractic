package ru.ssau.tk.Practice2_13;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array10Test {
    private static final double DELTA = 0.0001;

    @Test
    public void testArray() {
        int[] array = Array10.array(7);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 2, DELTA);
        assertEquals(array[2], 3, DELTA);
        assertEquals(array[3], 4, DELTA);
        assertEquals(array[4], 3, DELTA);
        assertEquals(array[5], 2, DELTA);
        assertEquals(array[6], 1, DELTA);
    }
}