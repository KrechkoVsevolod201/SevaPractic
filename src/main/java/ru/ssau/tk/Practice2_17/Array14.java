package ru.ssau.tk.Practice2_17;

public class Array14 {
    static int number(int[] arr) {
        int j = 0;
        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }
}
