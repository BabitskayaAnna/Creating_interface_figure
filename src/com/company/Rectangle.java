package com.company;

public class Rectangle implements Object, GeomFig {
    private double a,b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    public double GetA(){
        return a;
    }
    public double GetB(){
        return b;
    }

    public float FindSquare(){
        return (float)(a*b);
    }

    public void printInfo(){
        System.out.println("Сторона1: "+ GetA()+" Сторона2: " + GetB()+ " Площадь: " + FindSquare());
    }
}
