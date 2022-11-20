/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
public class Test {

    static int a;

    static { //bu blok nesne örneği oluşturulmasa dahi çalışır ve constructordan önce çalışır
        a = 4;
        System.out.println("Static block çalıştı.");
        System.out.println("a = " + a);
    }

    public Test() {

        System.out.println("Constructor çalıştı");
        a = 10;
    }
    
    public static void func()
    {
        a=a+1;
        System.out.println("a = " + a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Test obj=new Test();
        obj.func(); //static metod bu şekilde de çağrılabilir Test.func() şeklinde sınıf adıyla da
        
    }
}
