package ru.ssau.tk.Practice2_26;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array23Test {

    @Test
    public void testSumma() {
        assertEquals(Array23.summa(new int[]{2, 4, 6, 8, 10}), new int[]{6, 14, 10});
        assertEquals(Array23.summa(new int[]{2, 4, 6, 8, 10, 12, 14, 16}), new int[]{6, 14, 22,30});

    }
}