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
public class TryCatch {
    public static void main(String[] args) {
        
    try{
        System.out.println("try statetement excuted ");
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        System.out.println("this will execute all the time after any one of try and catch statement");
    }    
    }
    
}
