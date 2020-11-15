package ru.ssau.tk.Practice2_13;

public class Array10 {
    public static int[] array(int size) {
        if (size == 0){
            return null;
        }
        int[] arr = new int[size];
        for (int i = 0; i < Math.ceil((double)size/2); i++){
            arr[i] = i+1;
            arr[size-i-1] = i+1;
        }
        return arr;
    }
}
