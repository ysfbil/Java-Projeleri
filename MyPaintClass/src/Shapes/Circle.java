package Shapes;


import Shapes.Shape;
import java.awt.Color;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ysfbil
 */
public class Circle extends Shape {

    public Circle(Graphics g, Color dotColor) {
        super(g, dotColor,true);
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x, y;

        Double r = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        for (int i = 0; i < 360; i++) {
            y = (int) (y1 + r * Math.sin(i * Math.PI / 180));
            x = (int) (x1 + r * Math.cos(i * Math.PI / 180));
            drawPoint(x, y);

        }
    }

}
