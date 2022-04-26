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

public class ShoppingBasket {

    private Map<String,Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String,Purchase>();
    }

    public void add(String product, int price) {
        Purchase item = new Purchase(product, 1, price);
//
        if (this.purchases.containsKey(product)) {
            this.purchases.get(product).increaseAmount();
        } else {
            this.purchases.put(product,item);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase item : this.purchases.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
//
    public void print() {
        for (Purchase item : this.purchases.values()) {
            System.out.println(item);
        }
    }

}
