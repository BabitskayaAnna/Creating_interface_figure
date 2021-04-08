package com.company;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle (double a,double b, double c, String type){
        super(a,b,c,type);
    }
    public float FindSquare(){
        return (float) (a*a*(Math.sqrt(3))/4);
    }
    public void  printInfo(){
        System.out.println("Сторона1: "+GetA()+"Сторона2: "+GetB()+"Сторона3: "+ GetC()+" Тип: "+ GetType()+ "Площадь: "+ FindSquare());
    }
    public String GetType(){
        return type;
    }
}
