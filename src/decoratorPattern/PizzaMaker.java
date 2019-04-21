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
public class PizzaMaker {
    public static void main(String[] args){
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        
        System.out.println("Ingredients: " + basicPizza.getDescription());
        
        System.out.println("Price: " + basicPizza.getCost());
    }
}
