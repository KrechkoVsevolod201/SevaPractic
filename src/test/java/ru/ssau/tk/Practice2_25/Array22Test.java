package ru.ssau.tk.Practice2_25;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array22Test {

    @Test
    public void testArray() {
        int[] array = new int[]{2, 4, 6};
        int[] arr = Array22.array(array);
        assertEquals(array[0],2);
        assertEquals(array[0],2);
    }
}