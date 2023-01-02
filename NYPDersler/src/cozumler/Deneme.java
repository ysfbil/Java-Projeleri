/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

/**
 *
 * @author ysfbil
 */
public class Deneme {
    public static int x=0; //ilk bu çalışır
    static{
        x=1; //sonra bu çalışır
    }
    
    public Deneme()
    {
       x=x++; //nesne oluşturulunca çalışır. önce atamış sonra arttırmış
      //  System.out.println("x = " + x);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme();
        Deneme obj3=new Deneme();
        System.out.println("x1 = " + obj1.x);
        System.out.println("x2 = " + obj2.x);
    
    }
}
