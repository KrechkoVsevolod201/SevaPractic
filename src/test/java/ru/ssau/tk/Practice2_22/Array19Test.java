package ru.ssau.tk.Practice2_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array19Test {

    @Test
    public void testIndexOftenNumber() {
        int[] array = new int[]{1, 5, 10, 12, 15};
        assertEquals(Array19.IndexOftenNumber(array, 1), 0);
        assertEquals(Array19.IndexOftenNumber(array, 10), 2);
        assertEquals(Array19.IndexOftenNumber(array, 12), 3);
    }
}