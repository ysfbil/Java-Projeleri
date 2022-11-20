/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
public class StaticOrnegi {
    int ogrenciNo,ogrenciYas;
    String name;
    static String universite="SİÜ";
    
    StaticOrnegi(int ogrenciNo,String name){
        this.ogrenciNo=ogrenciNo;
        this.name=name;
    }

    void goster(){
        
       
        System.out.println(ogrenciNo+", "+name+" ,"+universite);
    }
    
    void nonStaticFunc()
    {
         universite="SÜTÜ";
    }
    
    static void staticFunc()
    {
        universite="SÜRÜ";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        StaticOrnegi ogrenci=new StaticOrnegi(13,"Yusuf");
        ogrenci.goster();
        universite="SİÜOT";
        
        StaticOrnegi ogrenci2=new StaticOrnegi(21,"Ahmet");
        
        ogrenci.goster();
        ogrenci2.goster();
        ogrenci2.universite="SÜTOT";
        
        ogrenci.goster();
        
        ogrenci.nonStaticFunc();
        ogrenci.goster();
        
        StaticOrnegi.staticFunc();
        ogrenci.goster();
        
        
    }
}
