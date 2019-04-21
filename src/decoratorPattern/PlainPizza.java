/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;

/**
 *
 * @author Tim
 */
public class PlainPizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of dough: " + 4.00);
        return 4.00;
    }
    
}
