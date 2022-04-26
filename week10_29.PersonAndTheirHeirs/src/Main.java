import people.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> mathsDepartment = new ArrayList<Person>();
        
        mathsDepartment.add(new Teacher("Alice", "123 Some Street, London", 1400));
        mathsDepartment.add(new Student("Bob", "Flat 123, Some Road, London"));
        
        printDepartment(mathsDepartment);
    }
    
    public static void printDepartment(List<Person> people) {
        for (Person p: people) {
            System.out.println(p);
        }
    }
}
