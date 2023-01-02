/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu4;

/**
 *
 * @author ysfbil
 */
public class ObjectSinifi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       ObjectSinifi obj=new ObjectSinifi();
        System.out.println(obj.getClass().getName());
        System.out.println("obj.hashCode() = " + obj.hashCode());
        System.out.println("Integer.toHexString(obj.hashCode()) = " + Integer.toHexString(obj.hashCode()));
        System.out.println("obj.toString() = " + obj.toString());
    }
}
