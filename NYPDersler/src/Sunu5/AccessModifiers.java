/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sunu5;

import HariciPaket.Modifiers;

/**
 *
 * @author ysfbil
 */
class A {

    private int data = 40;

    private void msg() {
        System.out.println("mesaj" + data); //aynı sınıf içinden dataya erişmek mümkün
    } 

}

class B{
    private B()
    {
        System.out.println("B yapıcısı");
    }
}

public class AccessModifiers {

    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.data); //private olduğu için hata verirler
        //  System.out.println(obj.msg());
        
      //  B obj2=new B(); //B'Nin consturctorı private olduğundan hata verir.
      
     //Modifiers mf=new  Modifiers(3); //Constructor default olduğundan harici paketten erişim yok
     Modifiers mf2=new Modifiers();
     mf2.publicdeger=5; //sadece harici paketteki public degere erisimvar
     
     
     DahiliPakettenSinif dps=new DahiliPakettenSinif(1); //default const. kabul edildi
     DahiliPakettenSinif dps2=new DahiliPakettenSinif(); //public cont. kabul edildi.
     dps2.defaultdeger=5; 
     dps2.protecteddeger=10;
     dps2.publicdeger=20;
   //  dps2.privatedeger=199; //private değer aynı paketten dahi kabul edilmedi. Aynı dosyada olunca da kabul edilmiyordu
   //private sadece aynı sınıfta olunca erişilebilir.
   
     
    }
}
