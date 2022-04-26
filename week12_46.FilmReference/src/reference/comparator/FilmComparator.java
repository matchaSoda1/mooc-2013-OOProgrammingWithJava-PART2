/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;
import reference.domain.*;
import java.util.*;

/**
 *
 * @author junen
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> filmRatings;
    
    public FilmComparator(Map<Film, List<Rating>> filmRatings) {
        this.filmRatings = filmRatings;
    }
    
    public double getAvgRating(Film film) {
        //get average rating for one film
        double average = 0;
        
        Iterator<Rating> iterator = this.filmRatings.get(film).iterator();
        
        while (iterator.hasNext()) {
            int rating = iterator.next().getValue();
            average+=rating;
        }
        
        average/= this.filmRatings.get(film).size();
        return average;
    }
    
    @Override
    public int compare(Film film1, Film film2) {
        if (getAvgRating(film2) < getAvgRating(film1)){
            return -1;
        }
        if (getAvgRating(film2) > getAvgRating(film1)) {
            return 1;
        }
        return 0;
    }
    
}
