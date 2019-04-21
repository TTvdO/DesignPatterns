/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tim
 */
public class Subject implements ISubject{
    List<Observer> observersList = new ArrayList<>();
    
    int flag;
    
    public int getFlag(){
        return flag;
    }
    
    public void setFlag(int flag){
        this.flag = flag;
        notifyObservers();
    }
    
    public void register(Observer o){
        observersList.add(o);
    }
    
    public void unregister(Observer o){
        observersList.remove(o);
    }
    
    public void notifyObservers(){
        for(int i = 0; i < observersList.size(); i++){
            observersList.get(i).update();
        }
    }
}
