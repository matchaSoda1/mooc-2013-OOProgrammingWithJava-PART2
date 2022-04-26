/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author junen
 */
public class OneThingBox extends Box{
    private Collection<Thing> oneThing;
    
    public OneThingBox(){
        this.oneThing = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        if (this.oneThing.isEmpty()) {
            this.oneThing.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing){
        if (!this.oneThing.isEmpty()) {
            return this.oneThing.contains(thing);
        }
        return false;
    }
}
