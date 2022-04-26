/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author junen
 */
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees() {
        employees = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        employees.add(person);
    }
    
    public void add(List<Person> persons) {
        for (Person p : persons){
            employees.add(p);
        }
    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education e) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(e)) {
                System.out.println(person);
//                System.out.println(iterator.next()); doesn't work???
                
            }
        
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
