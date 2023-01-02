/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu5;



/**
 *
 * @author ysfbil
 */

class Operation
{
    int square (int n){
        return n*n;
    }
}

class Circle 
{
    Operation op; //aggregation
    double pi=3.14;
    
    double area(int radius)
    {
        op=new Operation();
        int kare=op.square(radius);
                
        return pi*kare;
                
    }
    
}
public class Aggregation {
    public static void main(String[] args) {
        Circle c=new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
