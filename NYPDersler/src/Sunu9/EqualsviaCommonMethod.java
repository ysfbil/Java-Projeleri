/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu9;



/**
 *
 * @author ysfbil
 */
public class EqualsviaCommonMethod {
      String ad;
    String soyad;
    
    EqualsviaCommonMethod(String ad,String soyad)
    {
        this.ad=ad;
        this.soyad=soyad;
    }
    
    @Override
    public int hashCode()
    {   //genellikle kullanılan hash algorimtması aşağıdaki gibidir.
        int prime = 31;
        int result=1;
        result=prime*result+((ad==null)? 0 : ad.hashCode());
        result=prime*result+((soyad==null)? 0 : soyad.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.hashCode() == ((EqualsviaCommonMethod) obj).hashCode();
    }
    
    public static void main(String[] args) {
         EqualsviaCommonMethod e1 = new EqualsviaCommonMethod("Yusuf", "Bilgen");
        EqualsviaCommonMethod e2 = new EqualsviaCommonMethod("Yusuf", "Bilgen");
        EqualsviaCommonMethod e3 = new EqualsviaCommonMethod("Ahmet Yasin", "Bilgen");
        

        System.out.println("e1?=e2 " + e1.equals(e2));
        System.out.println("e1?=e3 " + e1.equals(e3));
    }
}
