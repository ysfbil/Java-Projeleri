/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu5;

/**
 *
 * @author ysfbil
 */
class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }

    static void statikMetot() {
        System.out.println("statik metot");
    }
}

class Bike extends Vehicle {

    @Override
    void run() {
        System.out.println("Bike is running safely");
    }

    //  void statikMetot(){} // statik metot override edilemez
}

public class OverRiding {

    public static void main(String[] args) {

        Bike b = new Bike();
        b.run();

    }
}
