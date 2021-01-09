package ru.ssau.tk.Practice4_5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_5_childTest {

    @Test
        void test(){
        Task4_5_child temp = new  Task4_5_child();
            Assert.assertThrows(CloneNotSupportedException.class, temp::clone);
    }
}