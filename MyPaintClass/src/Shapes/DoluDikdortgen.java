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
public class DoluDikdortgen extends Shape {

    public DoluDikdortgen(Graphics g, Color dotColor) {
        super(g, dotColor, true);
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
       
        int x = x1;
        boolean sart = true;

        while (sart) {
            if (x1 < x2) {
                sart = (x <= x2);
                x++;
            } else {
                sart = (x >= x2);
                x--;
            }

            drawVerticalLine(x, y1, y2);
        }

     

    }

}
