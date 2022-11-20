/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu2;

/**
 *
 * @author ysfbil
 */
public class Ders {
    
    public int topla(int a,int b)
    {
        return a+b;
    }
    
//    public float topla(int a, int b){} //hata veriyor çünkü sadece dönüş türü değiştirmek imzayı değiştirmez
       
    private double topla(double a,double b)
    {
        return a+b;
    }
    
    int topla(int a,int b,int c)
    {
        return a+b+c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Ders d=new Ders();
       d.topla(1,2);
       d.topla(3.3,4.5);
       d.topla(3,4,5);
    }
    
    private int main(int a){ //main metodu overload edildi
        return 0;
    }
}
