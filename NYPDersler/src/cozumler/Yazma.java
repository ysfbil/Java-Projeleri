
//System.out.println() komutunu meydana getiren, System, out ve println deyimlerine
//karşılık gelen Sistem, disariya ve yaz deyimlerini simule edecek gerekli sınıf, metod
//ve nesne varlıklarını java’da kodlayınız. (not: kullanımı Sistem.disariya.yaz(“merhaba dünya”);
//gibi olacaktır.) 
package cozumler;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ysfbil
 */
class Sistem
{
    
    static final Yazici disariya=new Yazici();
    
   
}

class Yazici
{
      
    void yaz(String metin){
      
        System.out.println(metin);
       
       
    }
}

public class Yazma {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Sistem.disariya.yaz("Merhaba dünya");      
        Sistem.disariya.yaz("Hayat nasıl gidiyor");     
      
    }
}
