/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uygulama_odevi1;

/**
 *
 * @author ysfbil
 */
public class shift {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        byte a=0b011,b=0b100;
        System.out.println("Bin \tInteger değeri");
        System.out.println(Integer.toBinaryString(a>>1)+"   \t="+(a>>1));
        System.out.println(Integer.toBinaryString(a<<1)+" \t="+(a<<1));
        System.out.println(Integer.toBinaryString(b>>1)+"  \t="+(b>>1));
        System.out.println(Integer.toBinaryString(b<<1)+"\t="+(b<<1));
    }
}
