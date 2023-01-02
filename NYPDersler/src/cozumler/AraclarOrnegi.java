/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

class Araclar {

    double aci;
    int hiz, motorGucu, tekerSayisi, maxYuk;
    boolean otonomi;
    String motorTuru, aracTuru;

    public void direksiyonAcisiAyarla(double aci) {
        this.aci = aci;
        System.out.println("Direksiyon " + aci + " açısına dönecek");
    }

    public void motorHiziAyarla(int hiz) {
        this.hiz = hiz;
    }

    public int frenYap() {
        int durmaMesafesi = hiz * 2;
        System.out.println(durmaMesafesi + " metre sonra duracak");
        return durmaMesafesi;
    }

    public void otonomSurus() {
        System.out.println("Otonom sürüş durumu:" + otonomi);
    }

    public void bilgi() {
        System.out.println("Araç bilgileri:");
        System.out.println("aracTuru = " + aracTuru);
        System.out.println("motorTuru = " + motorTuru);
        System.out.println("maxYuk = " + maxYuk);
        System.out.println("tekerSayisi = " + tekerSayisi);
        System.out.println("motorGucu = " + motorGucu);
        System.out.println("otonomi = " + otonomi);
        System.out.println("-----------------------");
    }
}

class Otomobil extends Araclar {

    Otomobil() {
        aracTuru = "Otomobil";
        maxYuk = 1500;
        tekerSayisi = 4;
        

    }
}

class ElektrikliOtomobil extends Otomobil {

    ElektrikliOtomobil() {
        motorTuru = "Elektrikli";
        otonomi = false;
        motorGucu=400;
    }
}

class OtonomElektrikliOtomobil extends Otomobil {

    public OtonomElektrikliOtomobil() {
        otonomi = true;
        motorTuru = "Elektrikli";
         motorGucu=390;
    }

    @Override
    public void otonomSurus() {
        System.out.println("Otonom sürüş devreye girdi");
    }

}

class OtonomDizelOtomobil extends Otomobil {

    public OtonomDizelOtomobil() {
        otonomi = true;
        motorTuru = "Dizel";
         motorGucu=200;
    }

    @Override
    public void otonomSurus() {
        System.out.println("Otonom sürüş modu aktif");
    }

}

class Kamyon extends Araclar {

    Kamyon() {
        aracTuru = "Kamyon";
        maxYuk = 25000;
        tekerSayisi = 8;
        
    }
}

class OtonomElektrikliKamyon extends Kamyon {

    public OtonomElektrikliKamyon() {
        otonomi = true;
        motorTuru = "Elektrikli";
         motorGucu=500;
    }

    @Override
    public void otonomSurus() {
        System.out.println("Otonom sürüş aktif");
    }

}

class Otobus extends Araclar {

    Otobus() {
        aracTuru = "Otobus";
        maxYuk = 18000;
        tekerSayisi = 6;
    }
}

class ElektrikliOtobus extends Otobus {

    public ElektrikliOtobus() {
        otonomi = false;
        motorTuru = "Elektrikli";
         motorGucu=400;
    }

}

/**
 *
 * @author ysfbil
 */
public class AraclarOrnegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       OtonomElektrikliOtomobil oeo=new OtonomElektrikliOtomobil();
       ElektrikliOtomobil eo=new ElektrikliOtomobil();
       OtonomDizelOtomobil odo=new OtonomDizelOtomobil();
       OtonomElektrikliKamyon oek=new OtonomElektrikliKamyon();
       ElektrikliOtobus eob=new ElektrikliOtobus();
       
       oeo.bilgi();
       eo.bilgi();
       odo.bilgi();
       oek.bilgi();
       eob.bilgi();
    }
}
