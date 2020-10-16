package ru.ssau.tk.RandomCode;

public class FunctionCot implements MathFunction{
    @Override
    public double apply(double x) {
       return ((Math.cos(x)) / (Math.sin(x)));
    }
}
