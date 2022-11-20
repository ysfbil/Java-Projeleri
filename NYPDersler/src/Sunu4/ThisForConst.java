/*Kurucu metoda parametre olarak this
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

class B{
    A obj;
    B(A obj)
    {
        this.obj=obj;
    }
    
    void display(){
        System.out.println("obj.data = " + obj.data);
    }
}

class A{
    int data=10;
    A(){
        B b=new B(this);
        b.display();
    }
}

/**
 *
 * @author ysfbil
 */
public class ThisForConst {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        A a = new A();
    }
}
