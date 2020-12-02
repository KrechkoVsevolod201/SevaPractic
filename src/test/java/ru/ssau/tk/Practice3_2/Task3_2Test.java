package ru.ssau.tk.Practice3_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_2Test {

    @Test
    public void testGetString() {
        String str1 = "I love you";
        new Task3_2().getString(str1);
        String str2 = "Я тебя люблю";
        new Task3_2().getString(str2);
    }
}