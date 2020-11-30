package ru.ssau.tk.Practice2_32;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array28Test {

    @Test
    public void testSort() {
        Double[] arr = new Double[]{1. ,Double.NaN, 2.};
        Array28.sort(arr);
        assertEquals(arr[2].doubleValue(),Double.NaN);
        assertEquals(arr[0].doubleValue(),1.);
    }
}