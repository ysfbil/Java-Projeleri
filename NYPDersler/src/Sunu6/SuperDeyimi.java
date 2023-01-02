/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu6;

/**
 *
 * @author ysfbil
 */
class Vehicle {
    Vehicle(){
        System.out.println("Vehicle oluştu");
    }
    int speed = 50;
    
    void info(){
        System.out.println("Ata sınıfı hız="+speed);
    }
    
}

class Bike extends Vehicle{
    int speed=100;
    
    Bike(){
        //Burada yazmasak dahi compiler tarafından eklenmiş bir super() kodu vardır ve ata sınıfın contructorını çalıştırır
        System.out.println("Bike oluştu");
    }
    
    Bike(int speed){
        this.speed=speed;
        System.out.println("Hız="+speed);
    }
    
    void diplay(){
        System.out.println("Bike's speed="+speed+" Vehicle speed="+super.speed);
    }
    
    @Override
    void info(){
        System.out.println("Bike sınıfı. Hız="+speed);
        super.info();
    }
}

public class SuperDeyimi {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.diplay();
        
        Bike b2=new Bike(45);
        b2.info();
        
    }
}
