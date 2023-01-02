package Shapes;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ysfbil
 */
public class Shape {

    private Graphics g;
    private Graphics2D g2d;
    private Color dotColor;
    private boolean ikiNoktali;

    public Shape(Graphics g,Color dotColor,boolean ikiNoktali) {
        this.dotColor=dotColor;
        this.g = g;
        this.g2d=(Graphics2D) g;
        this.ikiNoktali=ikiNoktali;
        g2d.setPaint(dotColor);
    }
    
    public void setColor(Color dotColor)
    {
        this.dotColor=dotColor;
         g2d.setPaint(dotColor);
    }
    
    public Shape(Graphics g,Color dotColor) {
        this.dotColor=dotColor;
        this.g = g;
        this.g2d=(Graphics2D) g;
        this.ikiNoktali=false;
        g2d.setPaint(dotColor);
    }
    
    public boolean ikiNoktali()
    {
        return this.ikiNoktali;
    }

    public void draw(int x1, int y1, int x2, int y2) {
        drawPoint(x1,y1);
        drawPoint(x2,y2);
    }

    public void drawPoint(int x, int y) {        
       
        g2d.drawLine(x, y, x, y);
    }

    public void drawVerticalLine(int x, int y1, int y2) {
       
        int a1, a2;

        if (y1 > y2) {
            a1 = y1;
            a2 = y2;
        } else {
            a1 = y2;
            a2 = y1;
        };

        for (int y = a2; y <= a1; y++) {
            drawPoint(x, y);
        }

    }

    public void drawHorizontalLine(int x1, int x2, int y) {

        
        int a1, a2;

        if (x1 > x2) {
            a1 = x1;
            a2 = x2;
        } else {
            a1 = x2;
            a2 = x1;
        };

        for (int x = a2; x <= a1; x++) {
            drawPoint(x, y);
        }

    }

 

 
    

}
