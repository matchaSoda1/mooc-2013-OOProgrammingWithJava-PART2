/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author junen
 */
import java.util.*;
import moving.domain.*;

public class Packer {

    private int boxVolume;

    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();

        int i = 0;
        for (Thing thing : things) {
            boxes.add(new Box(boxVolume));
            boxes.get(i).addThing(thing);
            i++;
        }
        return boxes;
    }
}
