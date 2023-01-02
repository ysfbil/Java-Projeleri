/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

class MyClass {

    static private byte kacTane;

    private MyClass() {

    }

    public static MyClass getInstance() {
        if (kacTane < 3) {
            kacTane++;
            System.out.println("MyClass nesnesi oluşturuldu. Nesne sayısı="+kacTane);
            return new MyClass();
        }
        
        System.out.println("Bu nesneden en fazla 3 adet oluşturabilirsiniz. Nesne sayısı="+kacTane);
        return null;
    }
}

/**
 *
 * @author ysfbil
 */
public class EnFazla3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyClass s1=MyClass.getInstance();
        System.out.println(s1);
        
        MyClass s2=MyClass.getInstance();
        System.out.println(s2);
        
        MyClass s3=MyClass.getInstance();
        System.out.println(s3);
        
        MyClass s4=MyClass.getInstance();
        System.out.println(s4);
        
        
    }
}
