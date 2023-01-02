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
public class Rechtangle extends Shape {

    public Rechtangle(Graphics g, Color dotColor) {
        super(g, dotColor,true);
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {

        drawVerticalLine(x1, y1, y2);
        drawVerticalLine(x2, y1, y2);
        drawHorizontalLine(x1, x2, y2);
        drawHorizontalLine(x1, x2, y1);

    }

}
