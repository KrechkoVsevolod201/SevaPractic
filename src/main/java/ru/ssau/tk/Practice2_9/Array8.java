package ru.ssau.tk.Practice2_9;

public class Array8 {
    public static double[] getProgress(int size, int first, int difference) {
        double[] progress = new double[size];
        for (int i = 0; i != progress.length; i++) {
            progress[i] = first + i * difference;
        }
        return progress;
    }
}
