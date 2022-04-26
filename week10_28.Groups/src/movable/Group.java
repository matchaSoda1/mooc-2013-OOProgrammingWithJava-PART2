/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.*;

/**
 *
 * @author junen
 */
public class Group implements Movable {

    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism : this.group) {
            organism.move(dx, dy);
        }
    }

    public String toString() {
        String toString = "";
        if (this.group.size() > 0) {
            for (int i = 0; i < this.group.size() - 1; i++) {
                toString = toString + this.group.get(i).toString() + "\n";
            }
            toString = toString + this.group.get(group.size() - 1).toString();

            return toString;
        }
        return "";
    }
}
