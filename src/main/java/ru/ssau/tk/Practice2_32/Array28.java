package ru.ssau.tk.Practice2_32;

import java.util.Arrays;

public class Array28 {
    static void sort(Double[] arr) {
        for (Double j : arr) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(arr);
            }
        }
    }
}
