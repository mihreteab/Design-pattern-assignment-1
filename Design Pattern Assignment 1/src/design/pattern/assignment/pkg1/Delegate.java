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
public class Delegate {
    
    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();

        otherPrinter printer = new otherPrinter();
        printer.print();
    
    }
}

class ColorPrinter extends Printer
{
    Printer printer = new Printer();

    void print(){
        printer.print(); // this is delegates that get specific implementation of inheritance not force the subclass to implement it at runtime.

    }
}
class otherPrinter extends Printer {
    void print(){
        super.print(); // this simplyy extends the implementation of super class.
    }
}
class Printer
{
    void print(){
        System.out.println("Print papers");
    }
}