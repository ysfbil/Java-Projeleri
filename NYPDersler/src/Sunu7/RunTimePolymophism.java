/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu7;

/**
 *
 * @author ysfbil
 */
class Ata {
    int sayi=10;
    int deger=1;
    
    void bilgi() {
        System.out.println("Bu ata sınıfı");
    }
}

class Cocuk extends Ata {
    int sayi=100;
    
    Cocuk()
    {
        deger=2;
    }

    @Override
    void bilgi() {
        System.out.println("Bu çocuk sınıfı");
    }

}

class Cocuk2 extends Ata{
     void bilgi() {
        System.out.println("Bu çocuk 2 sınıfı");
    }
}

class Torun extends Cocuk{
    Torun(){
        deger=3;
    }
}


public class RunTimePolymophism {

    public static void main(String[] args) {
        Ata a = new Cocuk(); //çocuk atanın özelliklerine sahiptir. upcasting
        //Cocuk b=new Ata(); //Hata verir. çünkü ata çocuğun özelliklerine sahip değil.
        a.bilgi(); //Cocuğunki çağrılır.
        System.out.println(a.sayi); //Ata sınıftaki 10 yazar. Değişkenlerde upcasting çalışmaz
        
        Ata[] aile={new Ata(),new Cocuk(),new Torun()};
        for (Ata uye:aile){
            System.out.println(uye.deger);
        }
        
        Ata n1=new Ata();
        Cocuk n2=new Cocuk();
        Cocuk2 n3=new Cocuk2();
        
        Ata ref; //null nesnesine point eder.
        
        ref=n1;
        ref.bilgi(); //Ata'nın bilgisi
        
        ref=n2;
        ref.bilgi(); //cocuk bilgisi
        
        ref=n3;
        ref.bilgi(); //cocuk2 bilgisi
        
        
    }

}
