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
public abstract class ToppingDecorator implements Pizza{
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }
    //andere optie ipv hieronder
    public abstract String getDescription();
    
    //maakt niet uit wat je hier zet, is alleen een method die bestaat om een eigen implementatie te krijgen in de subklassen
    /*public String getDescription(){
        //return tempPizza.getDescription();
        return "";
    }*/
    
    //andere optie ipv hieronder
    public abstract double getCost();
    
    //maakt niet uit wat je hier zet, is alleen een method die bestaat om een eigen implementatie te krijgen in de subklassen
    /*public double getCost(){
        //return tempPizza.getCost();
        return 0;
    }*/
    
}
