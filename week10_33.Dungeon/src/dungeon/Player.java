
package dungeon;


public class Player {
    private Point point;
    private char charRepresentation;
    private boolean alive = true;
    
    
    public Player(int x, int y, char charRepresentation){
        this.point = new Point(x,y);
        this.charRepresentation = charRepresentation;
    }
    public Player(char charRepresentation){
        this.point = new Point(0,0);
        this.charRepresentation = charRepresentation;
    }
    public Player(){
        this(0,0,'@');
    }

    public int getX() {
        return point.getX();
    }

    public void setX(int x) {
        point.setX(x);
    }

    public int getY() {
        return point.getY();
    }

    public void setY(int y) {
        point.setY(y);
    }
    
    public void moveTo(int x, int y){
        point.setX(x);
        point.setY(y);
    }
    
    public Point getPoint(){
        return this.point;
    }
    
    public boolean isAlive(){
        return this.alive;
    }
    
    public void die(){
        alive = false;
    }

    public char getCharRepresentation() {
        return charRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }
    
    public String toString(){
        return this.charRepresentation + " " + this.point.getY() + " " + this.point.getX();
    }
    
    
}
