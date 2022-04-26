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

public class SkiCompetition {

    private int round;
    private List<Jumper> jumpers;
    private Scanner reader;

    public SkiCompetition(Scanner r) {
        this.round = 1;
        this.jumpers = new ArrayList<Jumper>();
        this.reader = r;
    }

    public void add(String name) {
        this.jumpers.add(new Jumper(name));
    }

    public void round() {

        String userInput = "";

        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            userInput = reader.nextLine();

            if (userInput.equals("jump")) {
                System.out.println("");
                System.out.println("Round " + this.round);
                System.out.println("");
                jumpOrder();
                System.out.println("");

                System.out.println("Results of round " + this.round);
                for (Jumper j : this.jumpers) {
                    j.jump();
                }
                System.out.println("");
                this.round++;

            } else {
                break;
            }
        }
    }

    public void jumpOrder() {
        //sort in order to have fewer points first
        Collections.sort(this.jumpers);
        int order = 1;
        System.out.println("Jumping order: ");
        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + order + ". " + jumper);
            order++;
        }
    }

    public void tournamentResults() {
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");

        Collections.sort(jumpers); //refuses to reverse without sorting first for some reason...
        Collections.reverse(this.jumpers);
        int order = 1;
        for (Jumper jumper : this.jumpers) {
            System.out.println(order + "           " + jumper);
            jumper.printJumpLengths();
            order++;
        }
    }
}
