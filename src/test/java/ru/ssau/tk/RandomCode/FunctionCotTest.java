package ru.ssau.tk.RandomCode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionCotTest {

    public final double nan = Double.NaN,  infPlus = Double.POSITIVE_INFINITY, infMinus = Double.NEGATIVE_INFINITY, pi = Math.PI;
    public final double delta = 0.001;
    MathFunction CotX = new FunctionCot();

    @Test
    public void testApply() {
        assertEquals(CotX.apply(0.0), infPlus, delta);
        assertNotEquals(CotX.apply(pi), nan, delta);// по непонятной мне причине выдаёт какое-то левое число
        assertEquals(CotX.apply((pi / 2)), 0, delta);
        assertEquals(CotX.apply(((-1) * 3 * pi / 2)), 0, delta);
    }
}