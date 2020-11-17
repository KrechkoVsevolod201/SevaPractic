package ru.ssau.tk.Practice2_16;

public class Array13 {
    static boolean arr(Integer[] arr) {
        for (int i : arr) {
            if (arr[i] == null) {
                return true;
            }
        }
        return false;
    }
}
