package Modelo;

import java.util.ArrayList;

public class ModeloSensor {

    private double temperatura;
    private double humedad;
    static ArrayList listTemp  = new ArrayList<>();

    public ModeloSensor() {

    }

    public ModeloSensor(double temperatura, double humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void mensaje() {
        System.out.println("La temperatura ingresada es: " + this.temperatura + "\n"
                + "La humedad ingresada es: " + this.humedad);
    }

    public void calcular() {
        listTemp.add(getTemperatura());
        if (getTemperatura() > 28 && getHumedad() > 60) {
            System.out.println("Sistema de aire acondicionado encendido");
        } else if (getTemperatura() >= 30) {
            System.out.println("Sistema de aire acondicionado encendido");
        } else {
            System.out.println("Sistema de aire acondicionado apagado");
        }
    }

    public void mostrarTemp(){
        System.out.println("Las temperatura ingresadas son: ");
        for (int i = 0; i < listTemp.size(); i++) {
            System.out.println(i+1 + ". " +listTemp.get(i)); 
            
        }
    }
}
