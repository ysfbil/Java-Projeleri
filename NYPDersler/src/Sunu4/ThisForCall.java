/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

/**
 *
 * @author ysfbil
 */
public class ThisForCall {
    int id,age;
    String name;
    
    
    ThisForCall(){
        System.out.println("Default Yapıcı metot çalıştı");
    }
    
    ThisForCall(int id,String name){
        this();//default constructor çağrıldı //bunun başta olması lazım
        this.id=id;
        this.name=name;
        
    }
    
    ThisForCall(int id,String name, int age){
        this(id,name);
        this.age=age;
    }
    
    void show(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ThisForCall ogrenci1=new ThisForCall();
        ThisForCall ogrenci2=new ThisForCall(12,"Yusuf");
        ThisForCall ogrenci3=new ThisForCall(56,"Ahmet",12);
        ogrenci1.show();
        ogrenci2.show();
        ogrenci3.show();
    }
}
