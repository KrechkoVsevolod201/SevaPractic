package ru.ssau.tk.Practice2_22;

public class Array19 {
    static int IndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
