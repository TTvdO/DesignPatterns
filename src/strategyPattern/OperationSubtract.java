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
public class OperationSubtract implements Strategy{

    @Override
    public int doOperation(int int1, int int2) {
        return int1 - int2;
    }
    
}
