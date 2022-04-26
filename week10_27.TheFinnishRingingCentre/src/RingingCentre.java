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

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String location) {

        if (!this.observations.containsKey(bird)) {
            this.observations.put(bird, new ArrayList<String>());
        }
        this.observations.get(bird).add(location);

    }

    public void observations(Bird bird) {
        System.out.print(bird + " observations: ");
        if (this.observations.containsKey(bird)) {
            System.out.println(this.observations.get(bird).size());
            for (String location : this.observations.get(bird)) {
                System.out.println(location);
            }
        } else {
            System.out.println("0");
        }

    }

}
