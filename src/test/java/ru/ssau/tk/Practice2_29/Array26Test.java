package ru.ssau.tk.Practice2_29;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array26Test {

    @Test
    public void testArr() {
        int[] array = Array26.arr(5, 3);
        assertEquals(array[0],3);
        assertEquals(array[1],4);
        assertEquals(array[2],5);
        assertEquals(array[3],1);
    }
}
