package ru.ssau.tk.Practice2_20;

public class Array17 {
    static boolean Array(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        for (int j : arr) {
            if (j % arr[0] == 0)
                count1++;
        }
        for (int i : arr) {
            if (i % arr[arr.length - 1] == 0)
                count2++;
        }
        return count1 > count2;
    }
}
