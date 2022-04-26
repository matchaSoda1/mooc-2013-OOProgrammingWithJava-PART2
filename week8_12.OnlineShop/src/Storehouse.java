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

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();

    }

    public void addProduct(String product, int price, int stockNumbers) {
        prices.put(product, price);
        stock.put(product, stockNumbers);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {

        if (this.stock(product) > 0) {
            int stockNo = this.stock(product);
            stockNo -= 1;
            this.stock.put(product, stockNo);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<String>();

        for (String key : this.prices.keySet()) {
            products.add(key);
        }
        return products;
    }
}
