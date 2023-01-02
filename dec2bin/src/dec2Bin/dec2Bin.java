/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dec2Bin;

import java.util.Scanner;

/**
 *
 * @author ysfbil
 */
public class dec2Bin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz");
        Scanner s = new Scanner(System.in);
        int sayi=s.nextInt();
        System.out.println("sayi = " + sayi);
        System.out.println("bin sayi = " + Integer.toBinaryString(sayi));
        System.out.println("Sayının tümleyeni = " + Integer.toBinaryString(~sayi));
        System.out.println("Sayının 2e tümleyeni = " + Integer.toBinaryString(~sayi+1));
    }
    
}
