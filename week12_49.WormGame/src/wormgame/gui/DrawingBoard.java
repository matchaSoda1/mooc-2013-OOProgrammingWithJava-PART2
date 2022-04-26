/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.game.WormGame;
import wormgame.domain.*;
/**
 *
 * @author junen
 */
public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame wormgame; 
    private int pieceLength;
    
    public DrawingBoard(WormGame wormgame, int pieceLength) {
        super.setBackground(Color.WHITE);
        this.wormgame = wormgame;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        for (Piece piece : wormgame.getWorm().getPieces()) {
        graphics.setColor(Color.BLACK);
        graphics.fill3DRect(pieceLength * piece.getX(), 
                pieceLength * piece.getY(), pieceLength, pieceLength, true);
        }
        
        Piece appleRef = wormgame.getApple();
        graphics.setColor(Color.RED);
        graphics.fillOval(pieceLength*appleRef.getX(), pieceLength* appleRef.getY(),
                pieceLength, pieceLength);
        
    }

    @Override
    public void update() {
        super.repaint();
    }
}
