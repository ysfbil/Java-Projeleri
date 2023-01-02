/*Metodun aktif sınıf örneğini geri döndürmesinde
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

class A{
    A getA(){
        System.out.println("A getirildi");
        return this;
    }
    
    A display(){
        System.out.println("Hello from A");
        return this;
    }
}




/**
 *
 * @author ysfbil
 */
public class ChainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       A a=new A();
       a.getA().display().display().display().getA();
    }
}
