/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junen
 */
import java.util.*;

public class TextUserInterface {

    private Scanner reader;
    private Airport airport;

    public TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            
            System.out.println("Choose operation");
            System.out.println("[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            
            String userInput = reader.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println("Give plane capacity: ");
                Integer planeCapacity = Integer.parseInt(reader.nextLine());

                airport.addAirplane(planeID, planeCapacity);
                
            } else if (userInput.equals("2")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println("Give departure airport code: ");
                String fromCode = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String toCode = reader.nextLine();

                airport.addFlight(planeID, fromCode, toCode);

            } else if (userInput.equals("x")) {
                break;
            }
        }

        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String userInput = reader.nextLine();

            if (userInput.equals("1")) {
                airport.printPlanes();
            } else if (userInput.equals("2")) {
                airport.printFlights();
            } else if (userInput.equals("3")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                airport.printPlaneInfo(planeID);
            } else if (userInput.equals("x")) {
                break;
            }

        }
    }
}
