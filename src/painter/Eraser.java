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
public class Eraser extends Pen{

    @Override
    public void draw(Graphics g) {
        g.clearRect(getX2(), getY2(), 15, 15);
    }

    @Override
    public Shape get() {
        return new Eraser();
    }
    
    
}
