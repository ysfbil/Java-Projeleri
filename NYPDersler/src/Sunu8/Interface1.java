/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu8;

/**
 *
 * @author ysfbil
 */
 interface IPrintable{
     int MIN=5;
     void print();
    // private void mesaj()İ //Inteface metotları pubic olamak zorunda
     void bilgi();
     static void statikMetot(){
         System.out.println("Interfaceten Statik metot");
     }
 }

interface IClickable{
    void click();
    void bilgi();
}

public class Interface1 implements IPrintable,IClickable{

    @Override
    public void print() {
        //MIN=3; //Interface değişkenleri otomatik olarak finaldır ve değiştirilemez.
        System.out.println("Interfaceler MIN="+MIN);
    }
    
      @Override
    public void click() {
        System.out.println("Click metod");
    }
    
      @Override
    public void bilgi() {
          System.out.println("İki interfacete de bilgi metodu var ama override edilmek zorunda oldğundan sorun yok!");
    }

    
    public static void main(String[] args) {
        IPrintable ip=new Interface1();
        ip.print();
        
        Interface1 ip2=new Interface1();
        ip2.print();
        ip2.click();
        ip2.bilgi();
        IPrintable.statikMetot();
    }

  
  
    
}
