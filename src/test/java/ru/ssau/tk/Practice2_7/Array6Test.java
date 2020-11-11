package ru.ssau.tk.Practice2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Array6Test {
    double Alfa = 0.0001;

    @Test
    public void _2test() throws Exception {
        double[] _2Eqution = Array6.massiv(0, 2, -4);
        assertEquals(_2Eqution[0], 2, Alfa);
    }

    @Test
    public void _1test() throws Exception {
        double[] _1SEqution = Array6.massiv(1, 1, -2);
        assertEquals(_1SEqution[0], 1, Alfa);
        assertEquals(_1SEqution[1], -2, Alfa);
    }

    @Test
    public void testNuN() throws Exception {
        try {
            double[] DoesNotExist = Array6.massiv(0, 0, 8);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решений нет");
        }

        try {
            double[] emptyEqution = Array6.massiv(0, 0, 0);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение - комлпексное число");
        }

        try {
            double[] ComplexNumbers = Array6.massiv(1, 3, 7);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение - вещественное число");
        }
    }
}