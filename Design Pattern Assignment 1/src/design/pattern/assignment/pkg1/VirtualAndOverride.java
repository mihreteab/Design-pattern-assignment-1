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
interface Supercalss {
    public int addNumbers(int a, int b);//here we write signiture only
}
public class VirtualAndOverride implements Supercalss{
    @Override
    public int addNumbers(int a, int b){
        //here we can write the implementation
        int sum = a + b;
        return sum;
        
    }
    public static void main(String[] args) {
        VirtualAndOverride subclass = new VirtualAndOverride();
        System.out.println("Sum: "+ subclass.addNumbers(6, 8));
    }
}
