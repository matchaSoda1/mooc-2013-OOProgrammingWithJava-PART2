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
    private List<Jumper> jumpers;
    private SkiCompetition skiComp;

    public TextUserInterface(Scanner r) {
        this.reader = r;
        this.jumpers = new ArrayList<Jumper>();
        this.skiComp = new SkiCompetition(r);
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");

        System.out.println("Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        String userInput = "";

        while (true) {
            System.out.print("    Participant name: ");
            userInput = reader.nextLine();

            if (!userInput.equals("")) {
                this.skiComp.add(userInput);
            } else {
                break;
            }

        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");

        skiComp.round();
        skiComp.tournamentResults();
        }
    }

