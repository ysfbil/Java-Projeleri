//formal parametre olarak  this
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

/**
 *
 * @author ysfbil
 */
public class ThisAsFormal {
    void bilgi(ThisAsFormal me){
        System.out.println("Bilgi metodu");
    }

    ThisAsFormal(){
        bilgi(this);
    }
    
    void myMethod(){
        System.out.println("My metod çalıştı");
        bilgi(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ThisAsFormal obj = new ThisAsFormal();
        obj.myMethod();
    }
}
