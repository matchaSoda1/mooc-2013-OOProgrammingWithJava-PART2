
public class Main {

    public static void main(String[] args) {

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

            Thing brick = new Thing("Beautiful brick", 1);
            Thing moreBrickWeight = new Thing("Even more beautiful brick", 1);
            
            Suitcase brickSuitcase = new Suitcase(100);
            brickSuitcase.addThing(brick);
            
            container.addSuitcase(brickSuitcase);
            System.out.println(container.toString());
                    
        int numberOfSuitcases = 1;

        while (numberOfSuitcases <= 100) {
            
            brickSuitcase.addThing(moreBrickWeight);
            container.addSuitcase(brickSuitcase);
            
            numberOfSuitcases++;
        }
    }
}

