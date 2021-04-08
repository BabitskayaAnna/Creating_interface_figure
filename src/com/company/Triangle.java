package com.company;

public abstract class Triangle implements  Object, GeomFig {
    public double a,b,c;
    public String type;

    public Triangle(double a, double b, double c, String type){
        this.a=a;
        this.b=b;
        this.c=c;
        this.type=type;
    }

    public double GetA() {
        return a;
    }
    public double GetB() { return b;}
    public double GetC() {
        return c;
    }
    public abstract String GetType();
}
