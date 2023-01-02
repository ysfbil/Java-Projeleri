/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu8;

/**
 *
 * @author ysfbil
 */
interface Printable{
    void print();
}

class A implements Printable{

    public void a(){
        System.out.println("A'nın a metodu");
    }
    
    @Override
    public void print() {
       
    }
    
}

class B implements Printable
{
    void b(){
        System.out.println("B'nin b metodu");
    }

    @Override
    public void print() {
        
    }
    
}

class Call{
    void invoke(Printable p){
        if (p instanceof A)
        {
            A a=(A)p;
            a.a();
        }
        
        if (p instanceof B)
        {
            B b=(B)p;
            b.b();
        }
    }
}

public class InstanceOfInterface {
    public static void main(String[] args) {
        Printable p=new B();
        Call c=new Call();
        c.invoke(p);
    }
}
