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
public class Mozzarella extends ToppingDecorator {
    
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }
    
    public String getDescription(){
        return tempPizza.getDescription() + ", mozzarrella";
    }
    
    public double getCost(){
        System.out.println("Cost of Moz: " + .50);
        
        return tempPizza.getCost() + .50;
    }
    
}
