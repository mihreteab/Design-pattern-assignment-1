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
public class CommandLineArgument {

    /**
     * @param args the command line arguments
     */
    //this program takes argument on run time and print the first argument
    public static void main(String[] args) {
        String firstArgument = args[1];
        System.out.println("The first argument is "+firstArgument);
//        System.out.println("Fuck off");
    }
    
}
