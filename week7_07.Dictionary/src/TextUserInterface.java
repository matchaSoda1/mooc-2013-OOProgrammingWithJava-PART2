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

    private Dictionary dictionary;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;

    }

    public void start() {

        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the user interface");
        System.out.println("");

        while (true) {
            System.out.print("Statement: ");
            
            String userInput = reader.nextLine();
            
            if (userInput.equals("add")) {
                this.add();
            } else if (userInput.equals("translate")) {
                this.translate();
            } else if (userInput.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    private void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();

        this.dictionary.add(word, translation);
        System.out.println("");
    }

    private void translate() {
        System.out.print("Word to translate: ");
        String translKey = reader.nextLine();
        System.out.println(this.dictionary.translate(translKey));
        System.out.println("");
    }
}
