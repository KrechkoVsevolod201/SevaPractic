package ru.ssau.tk.Practice2_8;

public class Array7 {
    public static double[] array(int size) {
        double[] arr = new double[size];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            arr[i] = j;
            j++;
        }
        return arr;
    }
}
