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

public class Main {

    
    public static void main(String[] args) {

        Bird bird1 = new Bird("Rose Startling", "Sturnus roseus", 2012);
        Bird bird2 = new Bird("Rose-Coloured Startling", "Sturnus roseus", 2012);
        Bird bird3 = new Bird("Rose-Coloured Startling", "Sturnus roseus", 2009);
   
        

        RingingCentre districtPark = new RingingCentre();

        districtPark.observe(new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia");
        districtPark.observe(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila");
        districtPark.observe(new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki");
        districtPark.observe(new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie");

        districtPark.observations(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012));
        System.out.println("--");
        districtPark.observations(new Bird("European Herring Gull", "Larus argentatus", 2008));
        System.out.println("--");
        districtPark.observations(new Bird("European Herring Gull", "Larus argentatus", 1980));
        

        
     
        
    }
}
