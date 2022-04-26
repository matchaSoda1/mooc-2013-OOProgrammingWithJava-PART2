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

public class UserInterface {

    private Scanner reader;
    private PhoneSearch phoneSearch;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.phoneSearch = new PhoneSearch();
    }

    public void menu() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

    public void commands() {
        while (true) {
            System.out.print("command: ");
            String userInput = reader.nextLine();
            try {
                int command = Integer.parseInt(userInput);

                if (command == 1) {
                    System.out.print("whose number: ");
                    String person = reader.nextLine(); //do you have to declare this every time?
                    System.out.print("number: ");
                    String phoneNo = reader.nextLine();
                    phoneSearch.addPhoneNumber(person, phoneNo);

                } else if (command == 2) {
                    System.out.print("whose number: ");
                    String person = reader.nextLine();
                    phoneSearch.givePersonsPhoneNumber(person);

                } else if (command == 3) {
                    System.out.print("number: ");
                    String number = reader.nextLine();
                    phoneSearch.searchByPhoneNumber(number);

                } else if (command == 4) {
                    System.out.print("whose address: ");
                    String person = reader.nextLine();
                    System.out.print("street: ");
                    String street = reader.nextLine() + " ";
                    System.out.print("city: ");
                    String city = reader.nextLine();
                    phoneSearch.addAddress(person, street + city);

                } else if (command == 5) {
                    System.out.print("whose information: ");
                    String person = reader.nextLine();
                    phoneSearch.personInfo(person);

                } else if (command == 6) {
                    System.out.print("whose information: ");
                    String person = reader.nextLine();
                    phoneSearch.remove(person);

                } else if (command == 7) {
                    System.out.print("keyword (if empty, all listed): ");
                    String keyword = reader.nextLine();
                    System.out.println("");
                    phoneSearch.keywordSearch(keyword);
                }
            } catch (Exception e) {
                if (userInput.equals("x")) {
                    break;
                }
//                } else {
//                    System.out.println("error: " + e.getMessage());
//                }
            }

        }
    }
}
