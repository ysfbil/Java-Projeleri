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

public class Abstract1 {

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }

}
