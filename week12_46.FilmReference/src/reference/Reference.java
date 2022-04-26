/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import reference.domain.*;
import java.util.Iterator;
/**
 *
 * @author junen
 */
public class Reference {

    private RatingRegister ratings;

    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }

    public Film recommendFilm(Person person) {

        if (hasRatedFilms(person)) {
            return recommendFilmBasedOnOwnRatings(person);
        }

        List<Film> films = ratings.getAllFilms();

        Map<Film, List<Rating>> filmRatings = ratings.filmRatings();
        Collections.sort(films, new FilmComparator(filmRatings));
        //sorts them into best scoring films to worst scoring films
        //using hashmap which has scores attached to each film using the list

        return films.get(0); //returns top recommended film from sorted list
    }

    public boolean hasRatedFilms(Person person) {

        return ratings.reviewers().contains(person);
    }

    public Film recommendFilmBasedOnOwnRatings(Person person1) {

        Person mostSimilarPerson = mostSimilarPerson(person1);

        List<Film> recommendedFilms = removeCommonFilms(person1,mostSimilarPerson);
        
        if (recommendedFilms.isEmpty()) {
            return null;
        }
        
        Map<Film, List<Rating>> forComparison = new HashMap<Film, List<Rating>>();

        for (Film film : recommendedFilms) {
            Rating filmRating = ratings.getRating(mostSimilarPerson, film);

            forComparison.put(film, new ArrayList<Rating>());
            forComparison.get(film).add(filmRating);
        }

        Collections.sort(recommendedFilms, new FilmComparator(forComparison));
        return recommendedFilms.get(0);
    }
    public List<Film> removeCommonFilms(Person person1, Person person2) {
        
        //remove duplicates if both people have seen the same film
        List<Film> person1Films = ratings.personFilmList(person1);
        List<Film> person2Films = ratings.personFilmList(person2);
        
        Iterator<Film> iterator = person2Films.iterator();
        
        while (iterator.hasNext()) {
            Film film = iterator.next();
            if (person1Films.contains(film)) {
                iterator.remove();
            }
        }
        return person2Films;
    }
    public Person mostSimilarPerson(Person person1) {

        Map<Person, Integer> ratingSimilarity = new HashMap<Person, Integer>();

        Map<Film, Rating> person1Ratings = ratings.getPersonalRatings(person1);

        
        List<Person> otherReviewers = ratings.reviewers();
        otherReviewers.remove(person1); //remove person 1 from reviewers list - else they will come up in their own similarity recommendations

        //populate comparator map
        for (Person person : otherReviewers) {

            Map<Film, Rating> person2Ratings = ratings.getPersonalRatings(person);
            int filmTasteSimilarity = personSimilarity(person1Ratings, person2Ratings);
            ratingSimilarity.put(person, filmTasteSimilarity);
        }

        Collections.sort(otherReviewers, new PersonComparator(ratingSimilarity));

        return otherReviewers.get(0);
    }

    public int personSimilarity(Map<Film, Rating> person1Ratings, Map<Film, Rating> person2Ratings) {

        int similarity = 1;

        for (Film film : person1Ratings.keySet()) {
            if (person2Ratings.containsKey(film)) {
                similarity *= person1Ratings.get(film).getValue()
                        * person2Ratings.get(film).getValue();
            }
        }
        if (similarity == 1) {
            return 0;
        }
        return similarity;
    }

}
