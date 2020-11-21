package ru.ssau.tk.Practice2_21;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array18Test {

    @Test
    public void testNumber() {
        int[] array = new int[]{1, 1, 1, 6,8};
        assertEquals(Array18.Number(array), 1);
        int[] temp = new int[]{0, 0, 6, 7, 3};
        assertEquals(Array18.Number(temp), 0);
    }
}