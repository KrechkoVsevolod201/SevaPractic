package ru.ssau.tk.Practice2_15;

public class Array12 {
    static boolean massiv(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
