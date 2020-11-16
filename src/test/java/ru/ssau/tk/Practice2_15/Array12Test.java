package ru.ssau.tk.Practice2_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array12Test {

    @Test
    public void testMassiv() {
        int[] massiv = {1, 4, 6, 8, 10};
        assertEquals(Array12.massiv(massiv, 4), true);
        assertEquals(Array12.massiv(massiv, 3), false);
        assertNotEquals(Array12.massiv(massiv, 7), true);
    }
}