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

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    public int measure() {
        if (this.sensors.size() == 0 || !this.isOn()) {
            throw new IllegalStateException();
        }

        int average = 0;

        for (Sensor s : this.sensors) {
            average += s.measure();
        }
        average = average / this.sensors.size();
        this.readings.add(average);
                
        return average;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
