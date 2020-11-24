package ru.ssau.tk.Practice2_24;

public class Array21 {
    static void getSdvig(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ~arr[i];
        }
    }
}
