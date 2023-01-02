/*
Bir sınıfın constructorlarının tümü private olarak tanımlanmış
ise başka bir sınıfın main metodu içinde bu sınıftan bir nesne 
nasıl yapabiliriz örnek üzerinde gösteriniz.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

class Kapali{
      private Kapali()
    {
        System.out.println("default constructor");
    }
    
     private Kapali(int sayi)
    {
        System.out.println("overload1 constructor: "+sayi);
    }
     
     public static Kapali KapaliOlsun()
     {
         return new Kapali();
     }
     
     public void bilgi()
     {
         System.out.println("Kapalı sınıfında bilgi");
     }
}

/**
 *
 * @author ysfbil
 */
public class TumuPrivate {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kapali k=Kapali.KapaliOlsun();
        k.bilgi();
        
    }
}
