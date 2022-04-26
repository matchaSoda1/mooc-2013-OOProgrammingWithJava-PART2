/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;
import reference.domain.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author junen
 */
public class PersonComparator implements Comparator<Person> {
    private Map<Person,Integer> peopleIdentities;
    
    public PersonComparator(Map<Person,Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }
    @Override
    public int compare(Person person1, Person person2) {
        //descending order - person 2 first vs person 1
        return Integer.compare(this.peopleIdentities.get(person2), this.peopleIdentities.get(person1));
    }

    
    
    
    
}


