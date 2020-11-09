package ru.ssau.tk.Practice2_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array3Test {

    @Test
    public void testMassif() {
        int[] array = Array3.massif(10);
        assertEquals(array[0], 20);
        assertEquals(array[1], 18);
        assertEquals(array[9], 2);

    }
}