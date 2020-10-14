package ru.ssau.tk.RandomCode;

import static org.testng.Assert.*;

public class MathBoyNextDooorTest {

    private final double PlusInf = Double.POSITIVE_INFINITY;
    private final double MinusInf = Double.NEGATIVE_INFINITY;
    private final double NaN = Double.NaN;
    private static final double delta = 0.001;

    MathBoyNextDooor testFunctionSqr = new FunctionSqr();

    @org.testng.annotations.Test
    public void testSetX() {

    }

    @org.testng.annotations.Test
    public void testSetY() {
        assertEquals(1, 1);
    }

    @org.testng.annotations.Test
    public void testSetZ() {
    }

    @org.testng.annotations.Test
    public void testGetX() {
    }

    @org.testng.annotations.Test
    public void testGetY() {
    }

    @org.testng.annotations.Test
    public void testGetZ() {
    }

    @org.testng.annotations.Test
    public void testFunctionSqr() {
        assertEquals(testFunctionSqr.apply(-2.0), 4.0,DELTA);
    }

    @org.testng.annotations.Test
    public void testFunctionSqrt() {
    }

    @org.testng.annotations.Test
    public void testFunctionCos() {
    }

    @org.testng.annotations.Test
    public void testFunctionTan() {
    }

    @org.testng.annotations.Test
    public void testFunctionCot() {
    }

    @org.testng.annotations.Test
    public void testFunctionSum() {
    }

    @org.testng.annotations.Test
    public void testFunctionMult() {
    }

    @org.testng.annotations.Test
    public void testFunctionDivision() {
    }
}