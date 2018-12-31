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
public class Property {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1754);
        student.setFirstName("Mihreteab");
        student.setLastName("Demeke");
        student.setDepartment("Software Engineering");
        System.out.println("Name: "+student.getName());
        System.out.println("Department: "+student.getDepartment());
        System.out.println("Id: "+student.getId());
        student.setFirstName("MihreteabEdited");
        System.out.println("Name: "+student.getName());
        System.out.println("Department: "+student.getDepartment());
        System.out.println("Id: "+student.getId());
        
    }
    
}
class Student{
    int id;
    String year;
    String department;
    String FirstName;
    String LastName;
    String age;
    void setFirstName(String Firstname){
        this.FirstName = Firstname;
    }
    void setLastName(String LastName){
        this.LastName = LastName;
    }
    void setDepartment(String department){
        this.department = department;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }
    void Setyear(String year){
        this.year = year;
    }
    String getYear(){
        return year; 
    }
    String getName(){
        return FirstName+" "+LastName;
    }
    String getDepartment(){
        return department;
    }
    
    
}