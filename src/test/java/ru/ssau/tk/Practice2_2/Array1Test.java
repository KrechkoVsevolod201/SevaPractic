package ru.ssau.tk.Practice2_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array1Test {

    @Test
    public void testMassif() {
        int[] firstArray = Array1.massif(10);
        assertEquals(firstArray.length, 10);
        assertEquals(firstArray[9], 2);
        assertEquals(firstArray[8], 1);
        assertEquals(firstArray[7], 1);
        assertEquals(firstArray[6], 1);
        assertEquals(firstArray[0], 2);
    }
}