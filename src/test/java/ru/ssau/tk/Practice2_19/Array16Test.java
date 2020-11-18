package ru.ssau.tk.Practice2_19;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array16Test {

    @Test
    public void testArray() {
        int[] array = new int[]{10, 4, 5, 7, 18};
        assertEquals(Array16.Array(array),33);//10+5+18
    }
}