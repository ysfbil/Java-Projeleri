/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu2;

/**
 *
 * @author ysfbil
 */
public class ImplicitTypeCast {
    
    public static double topla(int a,double b){
        System.out.println("a+b="+a+b);
        return a+b; //otomatik dönüşüm yapıp int -> double yapılır
        
    }
    
    
    
    public static void sum(long a,int b) {
        System.out.println("1. metod çalıştı");
    }
    
    public static void sum(int a,long b) {
        System.out.println("2. metod çalıştı");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        topla(3,5); //b int olan ovload metod olmadığından 5 otomatik double'a çevrilir
        //sum(3,5); //iki metod maliyet olarak denk olduğundan hata oluşur
        
        byte kucuksayi = 15;
        int ortaderece = 5000;
        double kocaman = ortaderece = kucuksayi; //her hangi bir type cast yazmada otomatik dönüştürüldü.

        kucuksayi = (byte) ortaderece; //typecast yapmak zorundayız
        ortaderece = (int) kocaman; //typecast yapmak zorundayız
        kocaman = 1e5;
        kucuksayi = (byte) kocaman; //typecast yaparken en üst bitten sığdığı kadar alır. 
        System.out.println("kucuksayi = " + kucuksayi);
        System.out.println("--------------------");
        System.out.println("byte = " + Byte.MAX_VALUE);
        System.out.println("short = " + Short.MAX_VALUE);
        System.out.println("char = " + (int) Character.MAX_VALUE);
        System.out.println("int = " + Integer.MAX_VALUE);
        System.out.println("long = " + Long.MAX_VALUE);
        System.out.println("float = " + Float.MAX_VALUE);
        System.out.println("double = " + Double.MAX_VALUE);

    }
}
