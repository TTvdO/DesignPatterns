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
public class ConcreteFactory extends IAnimalFactory{

    @Override
    public IAnimal getAnimalType(String type) {
        switch(type){
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                return null;
        }
    }
    
}
