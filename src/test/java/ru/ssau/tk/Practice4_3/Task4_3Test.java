package ru.ssau.tk.Practice4_3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_3Test {

    @Test
    public void testСharString() {
        String[] arrayStr = new String[]{"So","i","love","you"};
        assertEquals(Task4_3.сharString(arrayStr,0,0),
                'S');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_3.сharString(arrayStr,20,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task4_3.сharString(arrayStr,0,20));
    }
}