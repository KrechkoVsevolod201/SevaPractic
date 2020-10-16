package ru.ssau.tk.RandomCode;

public abstract class MathBoyNextDooor implements MathFunction {
    //делаю тестики

    private double x, y, z;
    private final double pi = Math.PI, e = Math.E;

    public MathBoyNextDooor() {

    }

    public MathBoyNextDooor(double x){
    this.x = x;
    }

    public MathBoyNextDooor(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public MathBoyNextDooor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double FunctionSum (double x, double y){
        return (x + y);
    }

    public double FunctionMulty (double x, double y){
        return (x * y);
    }

    public double FunctionDivision(double x, double y){
        return (x / y);
    }
}
