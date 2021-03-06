package ru.ssau.tk.Practice1_3;

import ru.ssau.tk.Practice1_18.Resettable;


    public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(double X, double Y, double Z) {
        super(X, Y, Z);
    }

    public NamedPoint(double X, double Y, double Z, String Name) {
        super(X, Y, Z);
        this.name = Name;
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public String getName() {
        return name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

        @Override
        public void reset() {
            this.name = "Absent";
        }
    }