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

public class PhoneSearch {

    private List<String> people;
    private Map<String, Set<String>> phoneNos;
    private Map<String, String> addresses;

    public PhoneSearch() {
        this.people = new ArrayList<String>();
        this.phoneNos = new HashMap<String, Set<String>>();
        this.addresses = new HashMap<String, String>();
    }

    public void addPhoneNumber(String person, String phoneNumber) {
        if (!this.phoneNos.containsKey(person)) {
            this.phoneNos.put(person, new HashSet<String>());
            this.people.add(person);
        }
        this.phoneNos.get(person).add(phoneNumber);
        System.out.println("");
    }

    public void givePersonsPhoneNumber(String person) {
        if (this.phoneNos.containsKey(person)) {
            for (String number : this.phoneNos.get(person)) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void searchByPhoneNumber(String phoneNumber) {
        String result = "";
        for (String person : this.phoneNos.keySet()) {
            if (this.phoneNos.get(person).contains(phoneNumber)) {
                result += person;
            }
        }

        if (result.equals("")) {
            System.out.println("  not found");
        } else {
            System.out.println(" " + result);
        }

    }

    public void addAddress(String person, String address) {
        if (!this.people.contains(person)) {
            this.people.add(person);
        }
        this.addresses.put(person, address);

        System.out.println("");
    }

    public void personInfo(String person) {

        if (!this.people.contains(person)) {
            System.out.println("  not found");
            System.out.println("");

        } else {
            if (this.addresses.keySet().contains(person)) {
                System.out.println("  address: " + this.addresses.get(person));
            } else {
                System.out.println("  address unknown");
            }

            if (this.phoneNos.keySet().contains(person)) {
                System.out.println("  phone numbers: ");
                for (String phoneNo : this.phoneNos.get(person)) {
                    System.out.println("   " + phoneNo);
                }
            } else {
                System.out.println("  phone number not found");
            }
            System.out.println("");
        }
    }

    public void remove(String person) {
        if (this.phoneNos.keySet().contains(person)) {
            this.phoneNos.remove(person);
        }
        if (this.addresses.keySet().contains(person)) {
            this.addresses.remove(person);
        }
        if (this.people.contains(person)) {
            this.people.remove(person);
        }
        System.out.println("");
    }

    public void keywordSearch(String keyword) {
        //Set<String> results = new HashSet<String>();
        //does not return an ordered list
        
        List<String> results = new ArrayList<String>();
        
        if (keyword.equals("")) {
            for (String person : this.people) {
                System.out.println(" " + person);
                this.personInfo(person);
            }
            return;
        }
        for (String person : this.people) {
            if (person.contains(keyword)) {
                results.add(person);
            }
            if (this.addresses.keySet().contains(person)) {
                if (this.addresses.get(person).contains(keyword) && !results.contains(person)) {
                    results.add(person);
                }
            }
        }
        
        Collections.sort(results);

        if (!results.isEmpty()) {
            for (String person : results) {
                System.out.println(" " + person);
                this.personInfo(person);
            }
        } else {
            System.out.println(" keyword not found");
            System.out.println("");
        }
    }

    public void printPeople() {
        System.out.println(this.people);
    }
}
