package Modelo;

import java.util.ArrayList;

public class ModeloAlarma {

    private ArrayList<ModeloSensor> sensores;

    public ModeloAlarma() {
        iniciarSensores();
    }

    public void iniciarSensores() {
        sensores = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            sensores.add(new ModeloSensor(i));
        }
    }

    public boolean activarSensor(int num) {
        if (num >= 1 && num <= sensores.size()) {
            ModeloSensor sensor = sensores.get(num - 1);
            return sensor.activar();
        }
        return false;
    }

    public void mostrarMensaje() {

        int contador = 0;

        for (ModeloSensor sensor : sensores) {
            if (sensor.isAct() == true) {
                contador++;
            }
        }
        if (contador >= 2) {
            System.out.println("¡INTRUSO! ¡INTRUSO!");
        } else {
            System.out.println("Sensores en linea, sin novedad");
        }
    }
}
