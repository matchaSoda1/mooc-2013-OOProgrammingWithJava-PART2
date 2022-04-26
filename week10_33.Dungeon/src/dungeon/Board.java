package dungeon;

import java.util.List;
import java.util.ArrayList;

public class Board {

    private int length;
    private int height;
    private List<String> lines;

    public Board(int length, int height) {
        this.length = length;
        this.height = height;
        this.lines = createBoard();
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    private List<String> createBoard() {
        List<String> board = new ArrayList<String>();
        for (int i = 0; i < height; i++) {
            board.add(createLine());
        }
        return board;
    }

    public void sketchBoard() {
        for (String boardLine : lines) {
            System.out.println(boardLine);
        }
    }

    public void placeChar(char yourChar, int x, int y) {
        String xLine = lines.get(x);
        
        StringBuilder sb = new StringBuilder(xLine);
        sb.setCharAt(y, yourChar);
        
        String newXLine = sb.toString();
        
        lines.set(x, newXLine);
    }

    public void placePlayer(Player yourPlayer, int x, int y) {
        char playerIcon = yourPlayer.getCharRepresentation();
        placeChar(playerIcon, x, y);
    }

    private String createLine() {
        String line = "";
        for (int i = 0; i < length; i++) {
            line += ".";
        }
        return line;
    }

}
