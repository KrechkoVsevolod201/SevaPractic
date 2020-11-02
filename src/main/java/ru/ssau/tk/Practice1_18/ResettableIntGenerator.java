package ru.ssau.tk.Practice1_18;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int X = 0;
    String name = "Absent";

    @Override
    public int nextInt() {
        return X++;
    }

    @Override
    public void reset() {
        X = 0;
    }

    public String getName() {

        return name;
    }
}