package ru.ssau.tk.Practice2_30;

public class Array27 {
    static int[][] vector(int size) {
        int[][] arr = new int[size][];
        int count = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        return arr;
    }
}
