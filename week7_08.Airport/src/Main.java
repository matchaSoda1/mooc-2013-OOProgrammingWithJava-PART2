
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
        Airport myAirport = new Airport();

        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, myAirport);
        ui.start();

    }
}
