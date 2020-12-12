package application;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author acer
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> tempList;

    public AverageSensor() {
        this.sensorList = new ArrayList();
        this.tempList = new ArrayList();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensorList) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensorList.forEach(Sensor::setOn);

    }

    @Override
    public void setOff() {
        this.sensorList.forEach(Sensor::setOff);
    }

    @Override
    public int read() {

        if (this.sensorList.isEmpty() || this.isOn() == false) {
            throw new IllegalStateException("Sad!");
        }
        double d = this.sensorList.stream()
                .mapToDouble(Sensor::read)
                .average()
                .getAsDouble();

        this.tempList.add((int) d);

        return (int) d;
    }

    public List<Integer> readings() {
        return this.tempList;
    }
}
