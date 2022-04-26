/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.*;
/**
 *
 * @author junen
 */
public class BlackHoleBox extends Box{
    private Collection<Thing> things;
    
    public BlackHoleBox(){
        this.things = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        things.add(thing);
    }
    
    public boolean isInTheBox(Thing thing){
        return false;
    }
}
