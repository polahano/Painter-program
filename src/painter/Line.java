/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;

import java.awt.Graphics;

/**
 *
 * @author Pola
 */
public class Line extends Shape {

    @Override
    public void draw(Graphics g) {
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }

   
    @Override
    public Shape get(){
    return new Line();
    }
}
