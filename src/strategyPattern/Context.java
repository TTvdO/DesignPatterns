/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

/**
 *
 * @author Tim
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    
    public int executeStrategy(int int1, int int2){
        return strategy.doOperation(int1, int2);
    }
    
}
