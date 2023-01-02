/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sunu7;

//import static java.lang.Math.*;
import static java.lang.Math.round;


/**
 *
 * @author ysfbil
 */
class A {

    final int sayi = 10;
    final int deger;
    static final int statikDeger;

    static {
        statikDeger = 90; //statik final değişkene bu şekilde ilk değer verilebilir.
    }

    A() {
        //statikDeger=90; //statik final değer sadece tanımlama kısmında veya static bloğunda ilk değer verilebilir. Boş bırakılıp yapıcıda değer verilemez.
        deger = 45; //başta değer verilmediği için kurucuda değer verilmesine izin verildi.
        //  sayi=100; //hata verir çünkü sayi final int
    }

    final public void bilgi() {
        //   deger=100; //ilk degeri olmayan final değişkene sadece kurucuda ilk değer atanmalıdır sonra da değer değiştirilemez.
        System.out.println("A'nın final bilgi metodu çalıştı");
    }

    public void mesaj(final int deger) {
        // deger=20; final parametre değişkenine sonraden değer verilemez/değiştirilemez.
        System.out.println("A dan gelen mesaj deger="+deger);
    }

}

class B extends A {

    //void bilgi() {} //hata verir çünkü bilgi atanın final metodu
    B() {
        super.bilgi(); //final sınıf çocuğa geçer ama override edilemez
    }
}

final class C {

}

//class D extends C{} //hata verir çünkü C final class
public class FinalDeyimi {

    public static void main(String[] args) {
        A a = new A();
        a.bilgi();
        a.mesaj(255); //parametre final olduğundan ilk değer atamasına izin verdi
        a.mesaj(444); //final paramereye ikinci değer ataması yaptık.
        // a.sayi=200; hata verir.
        B b = new B();
        //b.bilgi(); //hata veririr çünkü kalıtım ile geçen metot kalıtım ile doğrudan kullanılamaz.
        round(3.3);
    
    }

}
