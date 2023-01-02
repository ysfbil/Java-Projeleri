/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

/**
 *
 * @author ysfbil
 */
class Employee{
    int salary=40000;
}

class Programmer extends Employee{
    int bonus=10000;
    
}

public class Kalitim {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Programmer p1=new Programmer();
        Programmer p2=new Programmer();
        System.out.println("p1.salary = " + p1.salary);
        System.out.println("p1.bonus = " + p1.bonus);
      
    }
}
