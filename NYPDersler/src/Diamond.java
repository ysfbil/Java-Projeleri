/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ysfbil
 */
interface Interface1{
    default public void show(){
        System.out.println("Interface1 show");
    }
}

interface Interface2{
    default public void show(){
        System.out.println("Inteface2 show");
    }
}

public class Diamond implements Interface1, Interface2{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       new Diamond().show();
    }
    
    @Override
    public void show(){ //Bu metodu yazmazsak hata alırız. Çünkü her iki arayüz eşit hiyerarşide
        Interface1.super.show(); //bunları yazmak zorunlu değil
        Interface2.super.show(); //
    }
}
