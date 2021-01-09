package ru.ssau.tk.Practice4_8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UnCheckedTest {

    @Test
    public void test() {
        try {
            throwCheckedException();
        } catch (Exception e) {
            e.getCause();
        }
    }

    private void throwCheckedException() {
    }
}