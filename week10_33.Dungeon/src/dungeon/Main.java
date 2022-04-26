package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(10,10,5,10,false); 
        dungeon.run();

        //        board.sketchBoard();

        //        board.placeCharOn(3,7);
        //        board.sketchBoard();
        //        insertPrintBreak();
        //
        //        board.placeCharOnLine(3, 7);
        //
        //        board.sketchBoard();
        
        //        randomise vampire coordinates
        //        Point p1 = new Point(0, 1);
        //        Point p2 = new Point(5, 1);
        //        Point p3 = new Point(7, 9);
        //        Point p4 = new Point(0, 1);
        //
        //        System.out.println(p1.equals(p4));
        //        System.out.println(p2.equals(p3));
        //
        //        int height = 5; //x
        //        int length = 17; //y
        //
        //        int vampires = 4;
        //        Set<Point> randPoints = new HashSet<Point>();
        //        Random rand = new Random();
        //        
        //        while (randPoints.size()<vampires){
        ////            cannot start at 0,0 too
        //            int randX = rand.nextInt(height);
        //            int randY = rand.nextInt(length);
        //            if (randX!=0 && randY!=0) {
        //               randPoints.add(new Point(randX,randY));
        //            }
        //        }
        //        
        //        //assign vampires  random points
        //        
        //        List<Vampire> vampiresList = new ArrayList<Vampire>();
        //        
        //        for (Point p: randPoints){
        //            vampiresList.add(new Vampire(p.getX(),p.getY()));
        //        }
        //        
        //        for (Vampire v1 : vampiresList){
        //            System.out.println(v1);
        //        }

        
    }

    public static void printBreak() {
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
    }

}
