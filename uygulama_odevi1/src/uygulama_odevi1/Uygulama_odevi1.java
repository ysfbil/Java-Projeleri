/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uygulama_odevi1;

import java.util.Scanner;

/**
 *
 * @author ysfbil
 */
public class Uygulama_odevi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String kullanici="admin";
     int password = 12345;
     String dogrulama2="elma";
     
     Scanner s = new Scanner(System.in);
     System.out.println("Lütfen kullanıcı adınızı giriniz : ");
     String ad = s.next();
        System.out.println(kullanici);    
     if (ad.equals(kullanici))
     {
         System.out.println("Lütfen şifrenizi giriniz : ");
         int sifre = s.nextInt();
         if (sifre==password)
         {
              System.out.println("Lütfen güvenlik meyvenizi giriniz : ");
              String meyve = s.next();
              if (meyve.equals(dogrulama2))
              {
                  System.out.println("Hoş geldiniz");
              }
              else{
                  System.out.println("hatalı doğrulama");
              }
         }
         else{
             System.out.println("hatalı şifre");
         }
     }
     else{
         System.out.println("Hatalı kullanıcı");
     }
    }
    
}
