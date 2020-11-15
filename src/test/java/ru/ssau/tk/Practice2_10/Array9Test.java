package ru.ssau.tk.Practice2_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array9Test {

    @Test
    public void testGeometricProgression() {
        double[] array = Array9.GeometricProgression(5, 5, 3);
        assertEquals(array[0], 5, 0.00001);
        assertEquals(array[1], 25, 0.00001);
        assertEquals(array[2], 125, 0.00001);
    }
}