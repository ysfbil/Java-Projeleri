/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu6;

/**
 *
 * @author ysfbil
 */

class A{
    A()
    {
        System.out.println("1-A yapıcısı çalıştı");
    }
}

class B extends A{
    B()
    {
        //Burada yazmasak dahi gizli super() vardır ve önce bu çalışır
        //compiler aşağıdaki initializer bloğunu buraya kopyalar
        System.out.println("3-B yapıcısı çalıştı");
    }
    
    {
        System.out.println("2-initializer block çalıştı");
    }
}
public class CalismaSirasi {
    public static void main(String[] args) {
        B b=new B();
    }
}
