package reference;

import reference.domain.*;
import java.util.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");
        Film bluesBrothers = new Film("Blues Brothers");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikael = new Person("Mikke");
        Person tom = new Person("Thomas");
        Person arto = new Person("Arto");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, eraserhead, Rating.BAD);
        ratings.addRating(pekka, bluesBrothers, Rating.MEDIOCRE);

        ratings.addRating(mikael, eraserhead, Rating.BAD);

        ratings.addRating(tom, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(tom, bluesBrothers, Rating.GOOD);

        Reference ref = new Reference(ratings);
        System.out.println(tom + "'s recommendation: " + ref.recommendFilm(tom));
        System.out.println(mikael + "'s recommendation: " + ref.recommendFilm(mikael));
        System.out.println(matti + "'s recommendation: " + ref.recommendFilm(matti));
        System.out.println(arto + " recommendation: " + ref.recommendFilm(arto));

    }

}
