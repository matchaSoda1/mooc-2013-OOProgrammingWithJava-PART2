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

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();

    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return null;
        }
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.get(plate) == null) {
            return false;
        }
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate key: this.owners.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        
        List<String> owner = new ArrayList<String>();
        
        for (RegistrationPlate key: this.owners.keySet()) {
            if (!owner.contains(this.get(key))) {
                owner.add(this.get(key));
            }
        }
        
        for (String name : owner) {
            System.out.println(name);
        }
    }
}
