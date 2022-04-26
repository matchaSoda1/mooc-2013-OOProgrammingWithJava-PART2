package personnel;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Person dave = new Person("Dave",Education.D);
        
        Employees university = new Employees();
        university.add(dave);
        
        Person alice = new Person("Alice",Education.D);
        Person bob = new Person("Bob",Education.D);
        Person celineDion = new Person("Celine Dion",Education.GRAD);
        
        university.add(alice);
        university.add(bob);
        university.add(celineDion);
        university.print();
        System.out.println("");
        university.print(Education.D);
        
        System.out.println("==");
        
        university.fire(Education.GRAD);
        
        university.print();
    }
}
