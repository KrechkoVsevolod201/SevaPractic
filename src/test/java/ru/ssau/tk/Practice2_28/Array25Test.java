package ru.ssau.tk.Practice2_28;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array25Test {

    @Test
    public void testLongToInt() {
        assertEquals(Array25.intToLong(Array25.longToInt(2L)), 2L);
        assertEquals(Array25.intToLong(Array25.longToInt(0L)), 0L);
    }
}