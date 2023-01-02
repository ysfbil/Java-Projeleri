/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ysfbil
 */
public class Line extends Shape {

    public Line(Graphics g, Color dotColor) {
        super(g, dotColor,true);
    }
    
    
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        //m<-8 veya m>18 dikey çizgi çizilebilir

        int a1, a2, y;

        double m = (y2 * 1.0 - y1 * 1.0) / (x2 * 1.0 - x1 * 1.0);

        if (x1 > x2) {
            a1 = x1;
            a2 = x2;
        } else {
            a1 = x2;
            a2 = x1;
        }

        for (int x = a2; x <= a1; x++) {
            y = (int) (m * (x - x1) + y1);
            drawPoint(x, y);

        }
    }

}
