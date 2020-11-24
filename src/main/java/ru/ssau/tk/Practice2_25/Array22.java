package ru.ssau.tk.Practice2_25;

public class Array22 {
    static int[] array(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ~arr2[i];
        }
        return arr2;
    }
}
