/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author junen
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, HashMap<Film, Rating>> peoplesRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.peoplesRatings = new HashMap<Person, HashMap<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.filmRatings.containsKey(film)) {
            this.filmRatings.put(film, new ArrayList<Rating>());
        }
        this.filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        
        if (!this.peoplesRatings.containsKey(person)) {
            this.peoplesRatings.put(person, new HashMap<Film,Rating>());
        }
        peoplesRatings.get(person).put(film, rating);
        this.addRating(film, rating); //adds rating to non person centered list
    }

    public List<Rating> getRatings(Film film) {

        return this.filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {        
        return filmRatings;
    }
    
    public List<Film> getAllFilms() {
        List<Film> films = new ArrayList<Film>();
        for (Film film: this.filmRatings.keySet()) {
            films.add(film);
        }
        return films;
    }
   

    public Rating getRating(Person person, Film film) {

        if (this.peoplesRatings.get(person).containsKey(film)) {
            return this.peoplesRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (this.peoplesRatings.containsKey(person)) {
            return this.peoplesRatings.get(person);
        }
        return new HashMap<Film,Rating>();
    }
    
    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>();
        for (Person person: this.peoplesRatings.keySet()) {
            reviewers.add(person);
        }
        return reviewers;
    }
    
    public List<Film> personFilmList(Person person) {
        Set<Film> personFilms = this.getPersonalRatings(person).keySet();
        List<Film> personFilmList = new ArrayList<Film>();
        personFilmList.addAll(personFilms);
        
        return personFilmList;
    }
}
