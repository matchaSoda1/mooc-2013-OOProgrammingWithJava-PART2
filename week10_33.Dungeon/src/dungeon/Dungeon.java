package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Dungeon {

    private Board playingBoard;
    private int numberOfVampires;
    private int moves;
    private boolean vampiresMove;
    private Player player;

    public Dungeon(int length, int height, int vampires, int moves,
            boolean vampiresMove) {
        this.playingBoard = new Board(length, height);
        this.numberOfVampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.player = new Player();
    }

    public void run() {

        List<Vampire> vampires = createVampires();
        List<Player> allPlayers = new ArrayList<Player>();
        
        allPlayers.add(player);
        allPlayers.addAll(vampires);

        //place characters
        for (Player p : allPlayers) {
            playingBoard.placePlayer(p, p.getX(), p.getY());
        }

        //play
        while (moves >= 0) {
            
            if (vampires.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }
            if (moves == 0) {
                System.out.println("YOU LOSE");
                break;
            }
            
            printMoves();
            printPlayers(allPlayers);
            printBoard();
            
            Scanner reader = new Scanner(System.in);

            String input = reader.nextLine();
            String parseInput = "";

            for (int i = 0; i < input.length(); i++) {
                parseInput = "" + input.charAt(i);
                if (parseInput.equals("w")) {
                    moveUp(player);
                } else if (parseInput.equals("a")) {
                    moveLeft(player);
                } else if (parseInput.equals("s")) {
                    moveDown(player);
                } else if (parseInput.equals("d")) {
                    moveRight(player);
                }
            }

            Point playerPosition = player.getPoint();
            List<Vampire> dead = new ArrayList<Vampire>();
            for (Vampire v : vampires) {
                if (playerPosition.equals(v.getPoint())) {
                    v.die();
                    numberOfVampires--;
                    dead.add(v);
                }
            }
            vampires.removeAll(dead);

            if (vampiresMove) {
                List<Point> randPoints = createVampirePointsExcl(player.getX(), player.getY());
                for (int i = 0; i < vampires.size(); i++) {
                    Vampire v = vampires.get(i);
                    Point newPoint = randPoints.get(i);
                    move(v, newPoint.getX(), newPoint.getY());
                }
            }
            moves--;
        }
    }

    public void printMoves() {
        System.out.println(moves);
        System.out.println("");
    }

    public void printPlayers(List<Player> players) {
        for (Player p : players) {
            if (p.isAlive()) {
                System.out.println(p);
            }
        }
    }

    public void printBoard() {
        System.out.println("");
        playingBoard.sketchBoard();
        System.out.println("");
    }

    public void paintPlayerOnBoard(Player p) {
        playingBoard.placePlayer(p, p.getX(), p.getY());
    }

    public void clearOldPosition(Point pt) {
        playingBoard.placeChar('.', pt.getX(), pt.getY());
    }

    public void move(Player p, int toX, int toY) { //maybe the board class should have handled moving!
        Point oldPoint = new Point(p.getX(), p.getY());
        p.moveTo(toX, toY);
        paintPlayerOnBoard(p);
        clearOldPosition(oldPoint);
    }
    

    public void moveUp(Player p) {
        if (p.getX() != 0) {
            move(p, p.getX() - 1, p.getY());
        }
    }
    
    public void moveDown(Player p) {
        if (p.getX() != playingBoard.getHeight() - 1) {
            move(p, p.getX() + 1, p.getY());
        }
    }

    public void moveLeft(Player p) {
        if (p.getY() != 0) {
            move(p, p.getX(), p.getY() - 1);
        }
    }

    public void moveRight(Player p) {
        if (p.getY() != playingBoard.getLength() - 1) {
            move(p, p.getX(), p.getY() + 1);
        }
    }

    public List<Vampire> createVampires() {
        List<Vampire> vampires = new ArrayList<Vampire>();
        List<Point> vampirePoints = createVampirePointsExcl(0, 0);

        for (Point p : vampirePoints) {
            vampires.add(new Vampire(p.getX(), p.getY()));
        }
        return vampires;
    }

    public List<Point> createVampirePointsExcl(int excludeX, int excludeY) {
        int height = playingBoard.getHeight();
        int length = playingBoard.getLength();

        Random rand = new Random();
        Set<Point> randPoints = new HashSet<Point>();

        while (randPoints.size() < numberOfVampires) {
            int randX = rand.nextInt(height);
            int randY = rand.nextInt(length);
            if (randX != excludeX && randY != excludeY) {
                randPoints.add(new Point(randX, randY));
            }
        }
        return new ArrayList<Point>(randPoints);
    }

}
