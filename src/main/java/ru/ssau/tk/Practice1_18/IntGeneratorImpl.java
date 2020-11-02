package ru.ssau.tk.Practice1_18;

public class IntGeneratorImpl implements IntGenerator {
    private int X = 0;

    @Override
    public int nextInt() {
        return X++;
    }
}
