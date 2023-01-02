/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu8;

/**
 *
 * @author ysfbil
 */
class Animal{
    
}

class Dog extends Animal{
    
    int deger=10;
    
    static void metod(Animal a)
    {
       
        if (a instanceof Dog)
        {
            
            Dog d=(Dog)a;
            System.out.println("Downcasting başarılı! :"+d.deger);
        }
    }
}
public class InstanceOfOrnegi {
    public static void main(String[] args) {
        Animal a=new Dog();
        Dog.metod(a);
    }
}
