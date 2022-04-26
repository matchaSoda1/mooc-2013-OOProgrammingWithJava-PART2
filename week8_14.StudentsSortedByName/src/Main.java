
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args){
   
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Bob"));
        students.add(new Student("Alice"));
        
        Collections.sort(students);
        
        System.out.println(students);
    }
}
