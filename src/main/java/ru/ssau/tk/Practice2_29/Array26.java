package ru.ssau.tk.Practice2_29;

public class Array26 {
    static int[] arr(int size, int indexBegining) {
        if (indexBegining >= size) {
            return null;
        } else {
            int[] cout = new int[size];
            for (int i = 0; i < size; i++) {
                cout[i + indexBegining - (i + indexBegining >= size ? size : 0)] = i + 1;
            }
            return cout;
        }
    }
}
