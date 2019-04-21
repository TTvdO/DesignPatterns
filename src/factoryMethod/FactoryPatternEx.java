/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author Tim
 */
public class FactoryPatternEx {
    public static void main(String[] args){
        IAnimalFactory animalFactory = new ConcreteFactory();
        
        IAnimal DuckType = animalFactory.getAnimalType("Duck");
        
        DuckType.speak();
        
        
        
    }
}
