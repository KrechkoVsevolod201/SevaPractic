package ru.ssau.tk.Practice2_24;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array21Test {

    @Test
    public void testGetSdvig() {
        int[] arr = new int[]{2, 4, 6, 8, 10};
        Array21.getSdvig(arr);
        assertEquals(arr[0], -3);
        Array21.getSdvig(arr);
        assertEquals(arr[3], 8);
    }
}