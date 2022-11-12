/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uygulama_odevi1;

/**
 *
 * @author ysfbil
 */
public class etiketli {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        System.out.println("break döngüsü");
        
        bas1:
       for (int i=1;i<=1000;i++)
       {
           for (int j=1;j<=500;j++){
              
               if (j==81 || i>10) break bas1;
               
                System.out.println("break i=" + i+" j="+j);
           }
       }
        System.out.println("Continue döngüsü");
        bas2:
         for (int i=1;i<=1000;i++)
       {
           for (int j=1;j<=500;j++){
              
               if (j>81 || i>10) continue bas2;
               
                System.out.println("continue i=" + i+" j="+j);
           }
       }
    }
    
}

