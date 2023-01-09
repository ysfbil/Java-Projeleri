/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sunu9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ysfbil
 */
public class ONDuplicatedChar {
    
   public static void printDuplicates(String str)
  {
     HashMap<Character, Integer> count = new HashMap<>();
     Integer val=0;
     
     for (int i = 0; i < str.length(); i++) {
         Character c=str.charAt(i);
         if (count.containsKey(c))
             val= val+count.get(c);
         
         
         count.put(c,val);
         val= 1;
    
}
      System.out.println("Duplicate characters in a given string:"); 
      
      
       count.forEach((key,value)->{
           if (value>1)
               System.out.println(key+" karakteri "+value+" kez geçiyor.");
  });
      
         
  }
     
     
     public static void main(String[] args) {
        ONDuplicatedChar.printDuplicates("Yusuf Bilgen Siirt'te Yaşıyor.");
    }
}
