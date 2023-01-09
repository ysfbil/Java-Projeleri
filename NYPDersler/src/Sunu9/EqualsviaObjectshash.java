/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu9;

import java.util.Objects;

/**
 *
 * @author ysfbil
 */
public class EqualsviaObjectshash {
    String ad;
    String soyad;
    
    EqualsviaObjectshash(String ad,String soyad)
    {
        this.ad=ad;
        this.soyad=soyad;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(ad,soyad);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.hashCode() == ((EqualsviaObjectshash) obj).hashCode();
    }
    
    public static void main(String[] args) {
         EqualsviaObjectshash e1 = new EqualsviaObjectshash("Yusuf", "Bilgen");
        EqualsviaObjectshash e2 = new EqualsviaObjectshash("Yusuf", "Bilgen");
        EqualsviaObjectshash e3 = new EqualsviaObjectshash("Ahmet Yasin", "Bilgen");
        

        System.out.println("e1?=e2 " + e1.equals(e2));
        System.out.println("e1?=e3 " + e1.equals(e3));
    }
    
}
