package ru.ssau.tk.Practice2_18;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array15Test {

    @Test
    public void testArray() {
        int[] array = new int[]{19, 2, 4, 5, 15};
        assertNull(Array15.array(new int[]{}), null);
    }
}