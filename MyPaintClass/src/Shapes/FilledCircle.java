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
public class FilledCircle extends Line {
    
    public FilledCircle(Graphics g, Color dotColor) {
        super(g, dotColor);
    }
    
    @Override
       public void draw(int x1, int y1, int x2, int y2) {
        int x, y;

        Double r = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        for (int i = 0; i < 360; i++) {
            y = (int) (y1 + r * Math.sin(i * Math.PI / 180));
            x = (int) (x1 + r * Math.cos(i * Math.PI / 180));
           // drawPoint(x, y);
            super.draw(x1, y1, x, y);

        }
    }
    
  
}
