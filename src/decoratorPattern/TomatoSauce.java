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
public class TomatoSauce extends ToppingDecorator{
    
    public TomatoSauce(Pizza tempPizza){
        super(tempPizza);
        
        System.out.println("Adding sauce");
    }
    
    public String getDescription(){
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost(){
        System.out.println("Cost of sauce: " + .40);
        return tempPizza.getCost() + .40;
    }
    
}
