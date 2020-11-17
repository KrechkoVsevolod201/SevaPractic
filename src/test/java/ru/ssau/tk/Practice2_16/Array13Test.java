package ru.ssau.tk.Practice2_16;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array13Test {

    @Test
    public void testArr() {
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = null;
        assertTrue(Array13.arr(array));
    }
}