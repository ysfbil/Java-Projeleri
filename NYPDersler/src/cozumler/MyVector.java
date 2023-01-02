/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cozumler;

/**
 *
 * @author ysfbil
 */
public class MyVector {
    
    float[][] X;
    float sayi;
    int n,k;
    
  public static MyVector getInstance()
    {
        return new MyVector();
    }
       
    private MyVector()
    {
        n=30;
        k=100;
        X=new float[n][k];
        
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                sayi=(float)(Math.random()*(79+35)-35);
                X[i][j]=sayi;
            }
        }
    }
    
    MyVector yaz()
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                System.out.println("X("+i+","+j+")=" + X[i][j]);
            }
        }
        
        System.out.println("---------------");
        
        return this;
    }
    
    MyVector topla(float sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]+=sayi;
            }
        }
        return this;
    }
    
     MyVector cikar(float sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]-=sayi;
            }
        }
        return this;
    }
     
      MyVector carp(float sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]*=sayi;
            }
        }
        return this;
    }

       MyVector bol(float sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]/=sayi;
            }
        }
        return this;
    }
       
        MyVector vektorTopla(float[][] sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]+=sayi[i][j];
            }
        }
        return this;
    }
        
         MyVector vektorCarp(float[][] sayi)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<k;j++)
            {
                
                X[i][j]*=sayi[i][j];
            }
        }
        return this;
    }
       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       MyVector vec1=MyVector.getInstance();
       //vec.yaz().carp(3).yaz();
       MyVector vec2=MyVector.getInstance();
       vec1.yaz();
       vec2.yaz();
       vec1.vektorCarp(vec2.X).yaz();
    }
}
