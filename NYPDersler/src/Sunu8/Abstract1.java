/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu8;

/**
 *
 * @author ysfbil
 */
abstract class Bike {

    abstract void run();
}

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Run honda");
    }

}

abstract class Kawasaki extends Bike {
    //Bu sınıf abstract olduğu için run override etmek zorunda değil
}

interface A {

    void a();

    void b();

    void c();
}

abstract class B implements A {

    @Override
    public void b() {
        //B abstract sınıf olduğundan A interfacedeki bütün metotları override etmek zorunda değil 
        System.out.println("B deki b metodu");
    }
}

class M extends B {

    @Override
    public void a() {
        System.out.println("M deki a metodu");
    }

    @Override
    public void c() {
        System.out.println("M deki c metodu");
    }

}

public class Abstract1 {

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();

        A a = new M();
        a.a();
        a.b();
        a.c();

    }

}
