/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;


/**
 *
 * @author ysfbil
 */
public class Ders {
    int id;
    String name;

    
    Ders(){
        System.out.println("Ders sınıfında yeni bir nesne oluşturuldu.");
    }
    
    Ders(int id, String name)
    {
        System.out.println("İkinci constructor çalıştı");
        this.id=id;
        this.name=name;
       
    }
    
    //Constructor ile kopyalama
    Ders(Ders drs)
    {
        this.id=drs.id;
        this.name=drs.name;
    }
    
    void show(){
        
        System.out.println("Id="+id+" Name="+name);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Ders drs=new Ders();
        drs.show(); //Id değeri 0, Name değeri null olarak otomatik atandı.
        
        Ders drs2 = new Ders(123,"Matematik");
        drs2.show();
        
        //Nesne kopyalama
        Ders drs3 = new Ders(drs2); //Copy by consturctor
        drs3.show();
        System.out.println(drs2); //referans adresleri farklı yani aynı bellek bölgesinde değiller
        System.out.println(drs3);
        drs3.name="Fizik";
        drs2.show();
        drs3.show(); //kopya nesnedeki değişiklik diğerini etkilemedi çünkü adresler farklı
        
        Ders drs4 = new Ders(); //atama yoluyla kopyalama
        drs4=drs2;
        drs4.show();
        System.out.println(drs4); //bellek adresleri de aynı olur. Bu şekilde kopya oluşturmak mansızdır.
        drs4.id=344;
        drs2.show();
        //aynı adresi işaret ettiklerinden birindeki değişiklik diğerini doğrudan etkiler
        
        //constructorlar return olarak kendi sınıf örneğini/nesnesini döndürürler.
        //kurucu metotlar :
        /*
            * Nesneyi başlatırlar
            * Nesneyi heapte açarlar
            * Thread başlatırlar
            * Metot çağırırlar
        */
        
        
        
    }
}
