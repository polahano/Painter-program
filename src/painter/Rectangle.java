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
public class Rectangle extends Shape{
    
    @Override
    public void draw(Graphics g){
        if(isFilled()==false){
    g.drawRect(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));
        }else{
        g.fillRect(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));
        }
    }

    
   @Override
    public Shape get(){
    return new Rectangle();
    }
}


