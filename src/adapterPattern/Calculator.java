/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterPattern;

/**
 *
 * @author Tim
 */
public class Calculator {
    Rect rectangle;
    
    public double getArea(Rect r){
        rectangle = r;
        return rectangle.l * rectangle.w;
        
    }
}
