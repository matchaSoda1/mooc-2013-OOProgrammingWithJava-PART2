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

public class Jumper implements Comparable<Jumper> {

    private String name;
    private Random random;
    private int jumpLength;
    private int totalPoints;
    private ArrayList<Integer> judgeVotes;
    private ArrayList<Integer> jumpLengths;

    public Jumper(String name) {
        this.name = name;
        this.random = new Random();
        this.totalPoints = 0;
        this.judgeVotes = new ArrayList<Integer>();
        this.jumpLengths = new ArrayList<Integer>();
    }  

    public void jump() {
        this.jumpLength = random.nextInt(60) + 60;
        this.jumpLengths.add(jumpLength);
        this.judgeVotes = this.judgeVotes();
        
        System.out.println("  " + this.name);
        System.out.println("    length: " + this.jumpLength);
        System.out.println("    judge votes: " + this.judgeVotes);
        
        int judgeScores = this.judgeScores(this.judgeVotes);
        this.totalPoints+=this.jumpLength+judgeScores;
    }
    
    
    public ArrayList<Integer> judgeVotes() {

        ArrayList<Integer> judgeScores = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            judgeScores.add(random.nextInt(10) + 10);
        }
        return judgeScores;
    }
    
    public int judgeScores(ArrayList<Integer> judgeVotes) {
        Collections.sort(judgeVotes);
        int judgeScores = 0;
        for (int i = 1; i < judgeVotes.size() - 1; i++) {
            judgeScores += judgeVotes.get(i);
        }
        return judgeScores;
    }

    public void printJumpLengths() {
        System.out.print("            jump lengths: ");
        for (int i = 0; i<this.jumpLengths.size()-1; i++) {
            System.out.print(this.jumpLengths.get(i) + " m, ");
        }
        System.out.println(this.jumpLengths.get(jumpLengths.size()-1) + " m");
    }
    public String getName() {
        return this.name;
    }
    public int getPoints() {
        return this.totalPoints;
    }
    
    public int getJumpLength() {
        return this.jumpLength;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.totalPoints + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return this.totalPoints - jumper.getPoints();
    }
}
