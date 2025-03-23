package Modelo;

public class ModeloSensor {

    private int sensor;
    private boolean act;

    public ModeloSensor(int sensor) {
        this.sensor = sensor;
        this.act = false;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    public boolean activar() {
        if (act == false) {
            act = true;
            return true;
        } else {
            return false;
        }
    }
}
