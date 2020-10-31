package ru.ssau.tk.Practice1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double DELTA  = 0.0001;
    private static final double NEGATIVE_INFINITY = 0.0001;
    private static final double POSITIVE_INFINITY  = 0.0001;
    private static final double NaN  = 0.00001;
    Operation Identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(Identical.apply(25), 25, DELTA);
        assertEquals(Identical.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY, DELTA);
        assertEquals(Identical.apply(NaN), NaN, DELTA);
    }
    @Test
    public void testApplyTriple() {
        assertEquals(Identical.apply(1),1,DELTA);
        assertEquals(Identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(Identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
    }
}