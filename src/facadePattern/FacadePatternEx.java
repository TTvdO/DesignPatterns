/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadePattern;

/**
 *
 * @author Tim
 */
public class FacadePatternEx {
    public static void main(String[] args){
        RobotFacade rf1 = new RobotFacade();
        rf1.constructRobot("Green", "Iron");
        
        RobotFacade rf2 = new RobotFacade();
        rf2.constructRobot("Blue", "Gold");
        
    }
    
    
    
}
