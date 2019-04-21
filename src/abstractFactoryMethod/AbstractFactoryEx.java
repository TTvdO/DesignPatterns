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
public class AbstractFactoryEx {
    public static void main(String[] args){
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();
        
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());
        
        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();
        
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
        
    }
}
