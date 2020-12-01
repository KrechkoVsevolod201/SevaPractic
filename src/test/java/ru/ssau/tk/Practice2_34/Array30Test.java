package ru.ssau.tk.Practice2_34;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array30Test {

    @Test
    public void testMultiply() {
        assertEquals(Array30.multiply(new Double[]{Double.NaN, 3.,
                        Double.NEGATIVE_INFINITY,
                        Double.POSITIVE_INFINITY}).doubleValue(), 12.);
    }
}