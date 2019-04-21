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
public class AdapterPattern {
    public static void main(String[] args){
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle t = new Triangle(20,10);
        System.out.println("Area of triangle is: " + cal.getArea(t));
    }
}
