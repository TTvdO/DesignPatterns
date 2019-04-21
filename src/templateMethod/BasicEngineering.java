/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author Tim
 */
public abstract class BasicEngineering {
    public void Papers(){
        Math();
        SoftSkills();
        SpecialPaper();
    }
    
    private void Math(){
        System.out.println("Math");
    }
    
    private void SoftSkills(){
        System.out.println("SoftSkills");
    }
    
    public abstract void SpecialPaper();
}
