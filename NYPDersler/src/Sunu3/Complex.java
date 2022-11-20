//Bu kodun çıktısını tahmin ediniz
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
final class Complex {
    
    private double re,im;
    public Complex(double re, double im){
        this.re=re;
        this.im=im;
    }
    
    Complex(Complex c){
        System.out.println("Copy Constructer Called");
        this.re=c.re;
        this.im=c.im;
    }
    
    @Override
    public String toString(){
       return "("+re+" + "+im+"i)"; 
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Complex c1=new Complex(10,15);
        Complex c2=new Complex(c1);
        Complex c3=c1;
        System.out.println("c2 = " + c2);
        
    }
}
