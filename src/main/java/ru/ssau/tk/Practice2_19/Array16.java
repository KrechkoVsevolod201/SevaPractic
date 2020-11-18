package ru.ssau.tk.Practice2_19;

public class Array16 {
    static int Array(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
