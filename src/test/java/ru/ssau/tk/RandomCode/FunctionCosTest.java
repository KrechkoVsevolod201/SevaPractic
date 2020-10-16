package ru.ssau.tk.RandomCode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionCosTest {

    public final double infPlus = Double.POSITIVE_INFINITY, infMinus = Double.NEGATIVE_INFINITY, pi = Math.PI;
    public final double delta = 0.00001;
    MathFunction CosX = new FunctionCos();

    @Test
    public void testApply() {
        assertEquals(CosX.apply(0.0), 1.0, delta);
        assertEquals(CosX.apply(pi), -1, delta);
        assertEquals(CosX.apply((pi / 2)), 0, delta);
        assertEquals(CosX.apply(((-1) * 3 * pi / 2)), 0, delta);
    }
}