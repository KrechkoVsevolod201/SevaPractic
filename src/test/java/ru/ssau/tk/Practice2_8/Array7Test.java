package ru.ssau.tk.Practice2_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array7Test {

    @Test
    public void testArray() {
        double[] integer = Array7.array(10);
        assertEquals(integer[0], 1);
        assertEquals(integer[1], 2);
        assertEquals(integer[2], 4);
        assertEquals(integer[9], 14);
    }
}