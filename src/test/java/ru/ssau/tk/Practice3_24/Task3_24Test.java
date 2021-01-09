package ru.ssau.tk.Practice3_24;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

import static org.testng.Assert.*;

public class Task3_24Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "So i very happy";
        Task3_24.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        Task3_24.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}