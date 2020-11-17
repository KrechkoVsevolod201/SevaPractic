package ru.ssau.tk.Practice2_17;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array14Test {

    @Test
    public void testNumber() {
        int[] massiv = new int[9];
        for(int i=0;i<massiv.length;i++){
            massiv[i] = i;
        }
        assertEquals(Array14.number(massiv),5);
    }
}