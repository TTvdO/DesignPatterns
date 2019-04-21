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
public class Duck implements IAnimal {

    @Override
    public void speak() {
        System.out.println("Duck says Pack-pack");
    }
    
}
