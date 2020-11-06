package ru.ssau.tk.Practice2_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array2Test {

    @Test
    public void testMassif() {
        int[] array = Array2.massif(10);
        assertEquals(array[0], 1);
        assertEquals(array[1], 3);
        assertEquals(array[2], 5);
        assertEquals(array[3], 7);
        assertEquals(array[8], 17);
        assertEquals(array[9], 19);
    }
}