/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author junen
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    public void print() {
        String board = "";
        int alive = 0;

        System.out.println("");
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                if (isAlive(x, y)) {
                    board += "X";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }

        System.out.println(board);
        System.out.println("alive: " + howManyAlive());
    }

    @Override
    public void initiateRandomCells(double d) {

        int permute = 0;
        int numberAlive = (int) (d * getWidth() * getHeight());
        int numberDead = (int) ((1 - d) * (getWidth() * getHeight()));

        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                if (new Random().nextDouble() <= d) {
                    turnToLiving(x, y);
                } else {
                    turnToDead(x, y);
                }
            }
        }

        //v works but tests take a long time
//        int i = 0;
//        int randX = 0;
//        int randY = 0;
//
//        while (i <= numberDead) {
//            randX = new Random().nextInt(getWidth() + 1);
//            randY = new Random().nextInt(getHeight() + 1);
//            if (isAlive(randX, randY)) {
//                turnToDead(randX, randY);
//                i++;
//            }
//        }
    }

    public boolean isOutsideBoard(int x, int y) {
        //getWidth() comes from the super's (inherited class) method

        if (x > getWidth() - 1 || x < 0) {
            return true;
        } else if (y > getHeight() - 1 || y < 0) {
            return true;
        }

        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        //assign true to cell at x,y 
        if (!isOutsideBoard(x, y)) {
            getBoard()[x][y] = true;
        }

        //if coordinates are outside the board - do nothing
    }

    @Override
    public void turnToDead(int x, int y) {
        //assign false to cell at x,y
        if (!isOutsideBoard(x, y)) {
            getBoard()[x][y] = false;
        }
        //if coordinates are outisde the board - do nothing
    }

    @Override
    public boolean isAlive(int x, int y) {
        //says if a cell at x,y is alive
        //if the coordinates are outside the board - return false
        if (isOutsideBoard(x, y)) {
            return false;
        }
        return getBoard()[x][y];
    }

    public int howManyAlive() {
        int alive = 0;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (isAlive(i, j)) {
                    alive++;
                }
            }
        }
        return alive;
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {

        int numberOfNeighbours = 0;

        numberOfNeighbours += horizontalNeighbours(x, y);
        numberOfNeighbours += verticalNeighbours(x, y);
        numberOfNeighbours += diagonalNeighbours(x, y);

        return numberOfNeighbours;
    }

    public int diagonalNeighbours(int x, int y) {
        int diagonalNeighbours = 0;

        //top left neighbour - x-1, y+1
        diagonalNeighbours += hasNeighbour(x - 1, y + 1);
        //top right neighbour - x+1, y+1
        diagonalNeighbours += hasNeighbour(x + 1, y + 1);
        //bottom left neighbour - x-1, y-1
        diagonalNeighbours += hasNeighbour(x - 1, y - 1);
        //bottom right neighbour - x+1, y-1
        diagonalNeighbours += hasNeighbour(x + 1, y - 1);

        return diagonalNeighbours;
    }

    public int verticalNeighbours(int x, int y) {
        //vertical neighbours - up & down - y axis 
        return hasNeighbour(x, y + 1) + hasNeighbour(x, y - 1);
    }

    public int horizontalNeighbours(int x, int y) {
        //horizontal neighbours - left & right - x axis 
        return hasNeighbour(x + 1, y) + hasNeighbour(x - 1, y);
    }

    public int hasNeighbour(int x, int y) {
        int hasNeighbour = 0;
        if (isAlive(x, y)) {
            hasNeighbour++;
        }
        return hasNeighbour;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (isAlive(x, y) && livingNeighbours < 2) {
            turnToDead(x, y);
        }
        if (isAlive(x, y) && livingNeighbours > 2) {
            turnToLiving(x, y);
        }
        if (isAlive(x, y) && livingNeighbours > 3) {
            turnToDead(x, y);
        }
        if (!isAlive(x, y) && livingNeighbours == 3) {
            turnToLiving(x, y);
        }
    }

}
