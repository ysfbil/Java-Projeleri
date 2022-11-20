/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sunu3;

/**
 *
 * @author ysfbil
 */
class T1{
    int t=20;
}

class T2{
    int t=20;
    T2(){
        t=40;
    }
}

class Point{
    int m_x,m_y;
    public Point(int x,int y){m_x=x;m_y=y;}
    public Point(){this(10,10);}
    public int getX(){return m_x;}
    public int getY(){return m_y;}
    
}

public class Sorular {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        T1 t1=new T1();
        System.out.println("t1.t = " + t1.t);
        
        T2 t2=new T2();
        System.out.println("t2.t = " + t2.t);
        
        Point p1=new Point();
        System.out.println("p1.getX() = " + p1.getX());
    }
}
