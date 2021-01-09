package ru.ssau.tk.Practice4_2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {

    @Test
    public void testSet() {
        String[] str = {"So", "i", "love", "you"};
        assertEquals(Task4_2.symbol(str, 0), new String[]{"S", "i", "l", "y"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_2.symbol(str, 1));

        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.symbol(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.symbol(str1, 0));
    }
}