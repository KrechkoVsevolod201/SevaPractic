package ru.ssau.tk.Practice1_18;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    private static final double DELTA  = 0.0001;
    private static final double NaN  = 0.0001;
    IntGeneratorImpl generator = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(),0, 0.0001);
        assertNotEquals(generator.nextInt(),0.2, 0.0001 );
        assertEquals(generator.nextInt(),2, 0.0001);
        assertNotEquals(generator.nextInt(),NaN, 0.0001);
    }
}