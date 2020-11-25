package ru.ssau.tk.Practice2_27;

public class Array24 {
    static boolean[] arr(int[] array) {
        boolean[] array1 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] % 2 == 0;
        }
        return array1;
    }
}
