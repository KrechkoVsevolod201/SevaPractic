package ru.ssau.tk.Practice2_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array8Test {

    @Test
    public void testGetProgress() {
        double[] progression = Array8.getProgress(5,1,5);
        assertEquals(progression[0], 1, 0.0001);
        assertEquals(progression[1], 6, 0.0001);
        assertEquals(progression[2], 11, 0.0001);
        assertEquals(progression[3], 16, 0.0001);
        assertEquals(progression[4], 21, 0.0001);
    }
}