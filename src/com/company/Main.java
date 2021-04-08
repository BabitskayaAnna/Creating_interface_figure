package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circ1 = new Circle(2);
        circ1.printInfo();
        Rectangle rect1 = new Rectangle(3, 4);
        rect1.printInfo();
        for (int t = 0; t < 5; t++) {
            System.out.print("Для создания треугольника:");
            Scanner scan = new Scanner(System.in);
            double i = 0;
            System.out.println("Введите сторону1/катет1:");
            if (scan.hasNextDouble())
                i = scan.nextDouble();
            double j = 0;
            System.out.println("Введите сторону2/катет2:");
            if (scan.hasNextDouble())
                j = scan.nextDouble();
            double k = 0;
            System.out.println("Введите сторону 3/гипотенузу:");
            if (scan.hasNextDouble())
                k = scan.nextDouble();
            if (i >= j + k || j >= i + k || k >= j + i)
                System.out.println("тАКОГО ТРЕУГОЛЬНИКА НЕ СУЩЕСТВУЕТ");
            else {
                if (i == k && i == j) {
                    System.out.println("Вы создали равносторонний треугольник");
                    EquilateralTriangle trian1 = new EquilateralTriangle(i, j, k, "Равносторонний");
                    trian1.printInfo();
                } else {
                    if (k * k == i * i + j * j) {
                        System.out.println("Вы создали прямоугольный треугольник");
                        RightAngledTriangle trian2 = new RightAngledTriangle(i, j, k, "Прямоугольный");
                        trian2.printInfo();
                    } else {
                        System.out.println("Вы создали треугольник");
                        if (i == j || j == k || k == i) {
                            UniversalTriangle trian3 = new UniversalTriangle(i, j, k, "Равнобедренный");
                            trian3.printInfo();
                        } else {
                            UniversalTriangle trian4 = new UniversalTriangle(i, j, k, "разносторонний");
                            trian4.printInfo();

                        }
                    }
                }

            }
        }
    }
}

