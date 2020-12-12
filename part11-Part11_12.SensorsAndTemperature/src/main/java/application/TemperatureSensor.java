package application;

import java.util.Random;

/**
 *
 * @author acer
 */
public class TemperatureSensor implements Sensor {

    private boolean isItOn;

    public TemperatureSensor() {
        this.isItOn = false;
    }

    @Override
    public boolean isOn() {
        return isItOn;
    }

    @Override
    public void setOn() {
        this.isItOn = true;
    }

    @Override
    public void setOff() {
        this.isItOn = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is off.");
        }
        return new Random().nextInt(61) - 30;
    }

}
