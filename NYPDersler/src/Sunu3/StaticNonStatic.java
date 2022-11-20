/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
public class StaticNonStatic {
    
    static int staticSayi=10;
    int nonStaticSayi=20;
    
    static{
        System.out.println("Static blok çalıştırıldı");
       // System.exit(0);
    }
    
     
    void nonStaticFunc()
    {
        System.out.println("staticSayi="+staticSayi);
        System.out.println("nonStaticSayi = " + nonStaticSayi);
    }
    
    static void staticFunc()
    {
        System.out.println("staticSayi = " + staticSayi);
       // System.out.println("nonStaticSayi = " + nonStaticSayi); //static metod static olmayan değişkene doğrudan erişemez
       StaticNonStatic sns=new StaticNonStatic();
        System.out.println("sns.nonStaticSayi = " + sns.nonStaticSayi);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        StaticNonStatic.staticFunc();
        StaticNonStatic sns=new StaticNonStatic();
        sns.nonStaticFunc();
        
    }
}
