package ru.ssau.tk.Practice2_18;

public class Array15 {
    static Integer array(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int cout = 0;
        for (int i : arr) {
            if (arr[i + 1] > arr[i]) {
                cout = arr[i + 1];
            }
        }
        return cout;
    }
}
