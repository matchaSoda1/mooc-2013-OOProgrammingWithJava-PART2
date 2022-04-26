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

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    @Override
    public int compareTo(Hand hand){
        int hand1Score = 0;
        int hand2Score = 0;
        
        for (Card card: this.cards) {
            hand1Score+= card.getValue();
        }
        for (Card card: hand.cards) {
            hand2Score+= card.getValue();
        }
        return hand1Score-hand2Score;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
