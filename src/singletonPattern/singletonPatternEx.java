/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonPattern;

/**
 *
 * @author Tim
 */
public class singletonPatternEx {
    public static void main(String[] args){
        makeACaptain c1 = makeACaptain.getCaptain();
        
        System.out.println("Trying to make another captain");
        
        makeACaptain c2 = makeACaptain.getCaptain();
        
        if(c1 == c2){
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
