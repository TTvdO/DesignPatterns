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
public class makeACaptain {
    private static makeACaptain captain;
    
    private makeACaptain(){
        
    }
    
    public static makeACaptain getCaptain(){
        if(captain == null){
            captain = new makeACaptain();
            System.out.println("New captain selected");
        }
        else{
            System.out.println("You already have a captain");
        }
        return captain;
    }
}
