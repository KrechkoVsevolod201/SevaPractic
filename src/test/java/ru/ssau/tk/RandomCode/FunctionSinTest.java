package ru.ssau.tk.RandomCode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionSinTest {

    public final double nan = Double.NaN,  infPlus = Double.POSITIVE_INFINITY, infMinus = Double.NEGATIVE_INFINITY, pi = Math.PI;
    public final double delta = 0.001;
    MathFunction SinX = new FunctionSin();

    @Test
    public void testApply() {
        assertEquals(SinX.apply(0.0), 0.0, delta);
        assertEquals(SinX.apply(pi), 0.0, delta);
        assertEquals(SinX.apply((pi / 2)), 1, delta);
        assertEquals(SinX.apply((3 * pi / 2)), -1, delta);
    }
}