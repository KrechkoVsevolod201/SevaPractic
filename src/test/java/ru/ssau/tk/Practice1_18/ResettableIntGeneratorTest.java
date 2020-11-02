package ru.ssau.tk.Practice1_18;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    private static final double DELTA = 0.00001;
    private static final double NaN = 0.00001;

    ResettableIntGenerator generator = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(), 0, 0.00001);
        assertNotEquals(generator.nextInt(), 0.3, 0.00001);
        assertNotEquals(generator.nextInt(), 7, 0.00001);
    }

    @Test
    public void testreset() {
        assertEquals(generator.getName(), "Absent");
        assertNotEquals(generator.getName(), "Jivotnoe");
    }

    @Test
    public void testGetName() {
        assertNotEquals(generator.getName(), "Jivotnoe");
        assertEquals(generator.getName(), "Absent");
    }
}