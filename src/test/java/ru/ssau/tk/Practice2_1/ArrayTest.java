package ru.ssau.tk.Practice2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    Array massif1 = new Array();
    int[] massif2 = new int[5];
    int[] massif3 = new int[15];

    @Test
    public void testMassif() {
        assertEquals(massif1.massif(5), massif2);
        assertEquals(massif1.massif(15), massif3);
        assertNotEquals(massif1.massif(20), massif3);

    }
}
