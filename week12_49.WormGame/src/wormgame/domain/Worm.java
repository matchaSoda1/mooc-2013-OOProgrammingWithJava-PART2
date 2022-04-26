/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import wormgame.Direction;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author junen
 */
public class Worm {

    private Direction direction;
    private List<Piece> worm;
    private int x;
    private int y;
    private boolean canGrow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.worm = new ArrayList<Piece>();
        this.worm.add(new Piece(originalX, originalY));
        this.canGrow = true;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return this.worm.size();
    }

    public List<Piece> getPieces() {
        return this.worm;
    }

    public void move() {
        if (this.direction == Direction.RIGHT) {
            this.x++;
        }
        if (this.direction == Direction.LEFT) {
            this.x--;
        }
        if (this.direction == Direction.UP) {
            this.y--; //gui fault - y direction is opposite for some reason
        }
        if (this.direction == Direction.DOWN) {
            this.y++; //gui fault - y direction is opposite for some reason
        }
        
        if (getLength() < 3) {
            grow();
        }
        
        if (getLength() > 2 && !canGrow) {
            worm.remove(0);
        }
        
        
        Piece currentLocation = new Piece(this.x, this.y);
        worm.add(currentLocation);

        canGrow = false;
    }

    public void grow() {
        canGrow = true;
    }

    public boolean runsInto(Piece piece) {
        for (int i = 0; i < worm.size(); i++) {
            if (this.worm.get(i).getX() == piece.getX()
                    && this.worm.get(i).getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < worm.size() - 1; i++) {
            if (this.wormHead().getX() == this.worm.get(i).getX()
                    && this.wormHead().getY() == this.worm.get(i).getY()) {
                return true;
            }
        }
        return false;
    }

    public Piece wormHead() {
        return worm.get(worm.size() - 1);
    }
}
