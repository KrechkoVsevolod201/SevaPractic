package ru.ssau.tk.Practice1_15;

abstract public class Operation {
    abstract double apply(double number);

    double applyTripple(double number) {
        return apply(apply(apply(number)));
    }
}
