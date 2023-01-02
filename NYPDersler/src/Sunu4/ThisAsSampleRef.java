/*Aktif sınıfın örneğine referans vermek için

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

/**
 *
 * @author ysfbil
 */
public class ThisAsSampleRef {
    int sayi;
    String isim;
    ThisAsSampleRef(int sayi, String isim){
        this.sayi=sayi;
        this.isim=isim;
        System.out.println("isim = " + isim);
        System.out.println("sayi = " + sayi);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ThisAsSampleRef tsr=new ThisAsSampleRef(10,"Yusuf");
        
    }
}
