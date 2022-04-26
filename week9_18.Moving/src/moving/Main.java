package moving;

import moving.domain.*;
import moving.logic.Packer;
import java.util.*;
        
public class Main {

    public static void main(String[] args) {

        ArrayList<Thing> thingsToPack = new ArrayList<Thing>();

        thingsToPack.add(new Item("hairbrush", 4));
        thingsToPack.add(new Item("passport", 2));
        thingsToPack.add(new Item("toothbrush", 1));
        thingsToPack.add(new Item("desk", 8));

        Packer packer = new Packer(10);
        List<Box> test = packer.packThings(thingsToPack);
        System.out.println(packer.packThings(thingsToPack));
        }
    }


