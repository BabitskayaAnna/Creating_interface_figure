package com.company;

public class UniversalTriangle extends Triangle{

    public UniversalTriangle(double a,double b, double c, String type){
        super(a,b,c,type);
    }

    public float FindSquare(){
        return (float) Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
    }
    public void printInfo(){
        System.out.println("Сторона1: "+GetA()+"Сторона2: "+GetB()+"Сторона3: "+ GetC()+" Тип: "+ GetType()+ "Площадь: "+ FindSquare());
    }

    public String GetType(){
        return type;
    }
}
