import movable.*;

public class Main {

    public static void main(String[] args) {
        // test your program here
        
  
        Group petriDish = new Group(); 
        
        petriDish.addToGroup(new Organism(73,56));
        petriDish.addToGroup(new Organism(57,66));
        petriDish.addToGroup(new Organism(46,52));
        petriDish.addToGroup(new Organism(19,107));
        System.out.println(petriDish);
        
    }
}
