package ru.ssau.tk.Practice2_27;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array24Test {

    @Test
    public void testArr() {
        assertEquals(Array24.arr(new int[]{2, 5, 7}), new boolean[]{true, false, false});
    }
}