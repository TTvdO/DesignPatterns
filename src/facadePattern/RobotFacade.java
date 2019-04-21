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
public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;
    
    public RobotFacade(){
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }
    
    public void constructRobot(String color, String metal){
        System.out.println("\nCreation of the Robot start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("\nRobot creation end");
        System.out.println();
    }
    
    
}
