package ru.ssau.tk.Practice1_15;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private static final double DELTA = 0.00001;
    private static final double NEGATIVE_INFINITY = 0.00001;
    private static final double POSITIVE_INFINITY = 0.00001;
    private static final double NaN = 0.00001;
    Operation Tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(Tangent.apply(0), 0, DELTA);
        assertNotEquals(Tangent.apply(Math.PI), 3, DELTA);
        assertEquals(Tangent.apply(NaN), NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertNotEquals(Tangent.apply(Math.PI), NEGATIVE_INFINITY, DELTA);
        assertNotEquals(Tangent.apply(Math.PI/2), 0, DELTA);
        assertEquals(Tangent.apply(NaN), NaN, DELTA);
    }
}