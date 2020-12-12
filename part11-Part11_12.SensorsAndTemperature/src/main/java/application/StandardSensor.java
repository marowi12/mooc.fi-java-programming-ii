package application;

public class StandardSensor implements Sensor {

    private int startTemp;

    public StandardSensor(int x) {
        this.startTemp = x;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return startTemp;
    }

}
