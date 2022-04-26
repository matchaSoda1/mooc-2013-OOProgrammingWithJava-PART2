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

public class Airport {

    private HashMap<String, String> airplanes;
    private HashMap<String, String> flights;

    public Airport() {
        this.airplanes = new HashMap<String, String>();
        this.flights = new HashMap<String, String>();

    }

    public void addAirplane(String planeID, Integer planeCapacity) {
        String planeCap = "(" + planeCapacity + " ppl)";
        this.airplanes.put(planeID, planeCap);
    }

    public void addFlight(String planeID, String fromAirport, String toAirport) {

        if (this.airplanes.containsKey(planeID) & !fromAirport.equals(toAirport)) {
            String flightPath = "(" + fromAirport + "-" + toAirport + ")";
            this.flights.put(flightPath, planeID);
        }
        System.out.println(flights.size());
    }

    public void printPlanes() {
        for (String key : this.airplanes.keySet()) {
            System.out.println(key + " " + this.airplanes.get(key));
        }
    }

    public void printFlights() {

        String flightPath = "";
        String planeID = "";
        String planeCapacity = "";

        for (String key : this.flights.keySet()) {

            flightPath = key;
            planeID = this.flights.get(key);
            planeCapacity = this.airplanes.get(planeID);

            System.out.println(planeID + " " + planeCapacity + " " + flightPath);
        }
    }

    public void printPlaneInfo(String planeID) {
        
        if (this.airplanes.containsKey(planeID)) {
            System.out.println(planeID + " " + this.airplanes.get(planeID));
        }

    }
}
