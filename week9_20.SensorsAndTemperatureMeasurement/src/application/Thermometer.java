/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author junen
 */
import java.util.*;

public class Thermometer implements Sensor {

    private int temperature;
    private boolean on;

    public Thermometer() {

        this.temperature = -99;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;

    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        if (this.on) {
            Random random = new Random();
            return random.nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }

    }
}
