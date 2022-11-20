/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uygulama_odevi1;

/**
 *
 * @author ysfbil
 */
public class bitsel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int a=0b011,b=0b100,c=0b100,d=0b010;
        System.out.println(a==b && c>=d);
        System.out.println(a==b || c>=d);
        System.out.println(a | b);
        System.out.println(c & b);
    }
}
