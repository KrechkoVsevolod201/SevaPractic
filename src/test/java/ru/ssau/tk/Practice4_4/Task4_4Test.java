package ru.ssau.tk.Practice4_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_4Test {

    @Test
    public void testString() {
        Task4_4.string("4","2"); // output: 2
        Assert.assertThrows(ArithmeticException.class,
                () ->   Task4_4.string("4","0"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.string("u","1"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.string("u","a"));
    }
}