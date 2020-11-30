package ru.ssau.tk.Practice2_30;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array27Test {

    @Test
    public void testVector() {
        assertEquals(Array27.vector(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }
}