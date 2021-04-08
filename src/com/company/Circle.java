package com.company;

public class Circle implements Object, GeomFig {

    private double rad;

    public Circle (double rad){
        this.rad=rad;
    }
    private double GetRad(){
        return rad;
    }
    public float FindSquare(){
       return (float)(3.14*rad*rad);
    }

    public void printInfo (){
        System.out.println("Радиус: " + GetRad()+ " Площадь: "+ FindSquare());
    }
}
