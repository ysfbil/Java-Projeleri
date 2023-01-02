/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myuuid;

/**
 *
 * @author ysfbil
 */
import java.util.UUID;

public class JavaUUID {

    public static void generateUUIDJava() {
        //java'nın standar uuid sınıfı
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID generated - " + uuid);
        System.out.println("UUID Version - " + uuid.version());

        byte[] bayt = {'y', 'u', 's', 'u', 'f'}; //"Yusuf".getBytes() //veya bu şekilde

        uuid = UUID.nameUUIDFromBytes(bayt);
        System.out.println("UUID generated - " + uuid);
        System.out.println("UUID Version - " + uuid.version());
    }

    public static void main(String[] args) {
       
        generateUUIDJava();
    }

}
