package com.company;

public class RightAngledTriangle extends Triangle{

    public RightAngledTriangle (double a, double b, double c, String type) {
        super(a, b, c, type);
    }

    public float FindSquare(){
        return (float) (a*b/2);
    }
    public void printInfo(){
        System.out.println("Катет1: "+ GetA()+ " Катет2: " + GetB()+ " Гипотенуза: " +GetC()+" Тип: " +GetType() +" Площадь: "+FindSquare() );
    }

    public String GetType (){
        return type;
    }
}
