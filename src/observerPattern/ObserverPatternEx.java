/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

/**
 *
 * @author Tim
 */
public class ObserverPatternEx {
    public static void main(String[] args){
        Observer o1 = new Observer();
        Subject s1 = new Subject();
        
        s1.register(o1);
        
        s1.setFlag(10);
        s1.setFlag(15);
    }
}
