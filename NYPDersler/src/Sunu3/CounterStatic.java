/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
public class CounterStatic {
    
    static int counter=0;
    
    public CounterStatic() {
        counter++;
        System.out.println("Şu anki sayaç = " + counter);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       CounterStatic s1= new CounterStatic();
       CounterStatic s2= new CounterStatic();
       CounterStatic s3= new CounterStatic();
       
    }
}
