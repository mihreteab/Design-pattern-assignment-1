/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author mihre
 */
public class PolyMorphism {
        public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Circle();

        for (int i = 0; i < shapes.length ; i++) {
            shapes[i].area();
            System.out.println();
        }
    }
}
interface Shape {
    void area();
}
class Circle implements Shape{

    @Override
    public void area() {
        System.out.println("Area of Circle: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        Double radius = input.nextDouble();
        System.out.println("Area of Circle is: " + (radius*radius*3.14));

    }
}
class Square implements Shape
{

    @Override
    public void area() {
        System.out.println("Area of Circle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int length = input.nextInt();
        System.out.println("area of square: "+ (length*length));
    }
}
