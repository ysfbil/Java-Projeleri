/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu8;

/**
 *
 * @author ysfbil
 */
class Ata{
    
    int tc=12;
    
    void bilgi(){
        System.out.println("Ata sınıfı");
    }
}

class Cocuk extends Ata{
    
    
    int harclik=10;
            
    @Override
    void bilgi(){
        System.out.println("Çocuk sınıfı");
    }
}

public class InstanceOfDeyimi {
    public static void main(String[] args) {
        Ata a=new Ata();
        if (a instanceof Ata)
        {
            System.out.println("a.getClass() = " + a.getClass());
            System.out.println("a.getClass().getSimpleName() = " + a.getClass().getSimpleName());
            System.out.println("a.getClass().getName() = " + a.getClass().getName());
            System.out.println("a.getClass().getCanonicalName() = " + a.getClass().getCanonicalName());
            System.out.println("a.getClass().getTypeName() = " + a.getClass().getTypeName());
            System.out.println("a.getClass().toGenericString() = " + a.getClass().toGenericString());
            
        }
        
        Ata c=new Cocuk();
        if (c instanceof Cocuk && c instanceof Ata){
            System.out.println("Cocuk sınıfından dolayısıyla Ata sınıftan");
            
        }
        else if (c instanceof Ata){
            System.out.println("Ata sınıftan");
        }
        else{
            System.out.println("Çocuk veya Ata değil");
        }
        
       //a=c; //ata cocuk nesnesine eşitlenebilir. Aynı referans türü olduğundan (sol taraf)
       //c=a; //çocuk da ataya eşitlenebilir. 
       //a.bilgi();
       
       Ata ata=new Ata();
       Cocuk cocuk=new Cocuk();
       //ata=cocuk; //ata cocuğa eşitlenebilir. upcasting (küçük genişe eşitlenebilir compiler otomatik kırpar)
       //cocuk=ata; //cocuk ataya eşitlenemez (cocuk daha hacimli)
     //  cocuk =(Cocuk)ata; //Ancak cast edilebilir. Runtime hatası 
      //  System.out.println(cocuk.harclik);
    }
}
