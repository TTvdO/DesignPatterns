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
public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("5 and 10\n" + context.executeStrategy(5, 10));
        
        context = new Context(new OperationSubtract());
        System.out.println("5 and 10\n" + context.executeStrategy(5, 10));
    }
}
