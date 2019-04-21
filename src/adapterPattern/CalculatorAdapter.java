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
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;
    
    public double getArea(Triangle t){
        calculator = new Calculator();
        triangle = t;
        Rect r = new Rect();
        r.l = triangle.b;
        r.w = 0.5*triangle.h;
        return calculator.getArea(r);
    }
}
