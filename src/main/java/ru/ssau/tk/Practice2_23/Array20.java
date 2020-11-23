package ru.ssau.tk.Practice2_23;

public class Array20 {
    static void Array(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
            max = arr[i] > max ? arr[i] : max;
        }

        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                indexMin = i;
            }
            if (arr[i] == max) {
                indexMax = i;
            }
        }
        arr[indexMin] = max;
        arr[indexMax] = min;
    }
}
