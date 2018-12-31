/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.assignment.pkg1;

/**
 *
 * @author mihre
 */
public class OverLoading {
    public static void main(String[] args) {
        System.out.println("This program runs overloaded method called Square");
        System.out.println("The we can use one method with different signiture that means\n we can use Square method for both integer and double.");
        int number1 = Square(9);
        double number2 = Square(3.5);
        System.out.println("square of 9 is : "+number1);
        System.out.println("square of 3.5 is : "+number2);
        
        
        System.out.println("");
        }
    
    public static int Square(int i){
        return i*i;
    }
    public static double Square(double d){
        return d*d;
    }
}