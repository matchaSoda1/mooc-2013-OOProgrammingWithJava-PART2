package game;

import gameoflife.Simulator;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        PersonalBoard board = new PersonalBoard(100, 100); //5 wide, 10 long

        board.initiateRandomCells(0.9);
  
//        board.print();
//        GameOfLifeTester tester = new GameOfLifeTester(board);
//        tester.play();
        
        Simulator simulator = new Simulator(board);
        simulator.simulate();
    }

    public static void manageCell(String[][] board, int x, int y, int numberOfLivingNeighbours) {
        //every living cell dies if they have less than two living neighbours
        if (numberOfLivingNeighbours < 2) {
            turnDead(board, x, y);
        }

    }

    public static void turnDead(String[][] board, int x, int y) {
        board[x][y] = "";
    }

    public static void turnAlive(String[][] board, int x, int y) {
        board[x][y] = "X";
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
