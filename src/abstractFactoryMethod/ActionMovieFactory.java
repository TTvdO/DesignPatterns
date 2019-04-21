/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryMethod;

/**
 *
 * @author Tim
 */
public class ActionMovieFactory implements IMovieFactory{

    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
    
}
