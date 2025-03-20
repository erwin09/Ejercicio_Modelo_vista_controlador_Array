package Modelo;

import java.util.ArrayList;

public class ModeloTemperatura {

    private double temp;
    static ArrayList<Double> listTemp = new ArrayList<>();

    public ModeloTemperatura() {
    }
    

    public ModeloTemperatura(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void mostrarMensaje() {
        System.out.println("La temperatura registrada es: " + temp);
        this.listTemp.add(temp);
    }

    public void cuentaRegresiva() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "...");

        }
    }

    public void validarTemperatura() {

        if (getTemp() <= 10) {
            System.out.println("¡Se activo el calefactor!");
        } else if (getTemp() > 10 && getTemp() <= 25) {
            System.out.println("¡Sistema desactivado!");
        } else {
            System.out.println("¡Se activo el ventilador!");
        }
    }
    

    public void mostrarHistorial(){
        System.out.println("Historial de temperatura: ");
        for (int i = 0; i < listTemp.size(); i++) {
            System.out.println(i+1 + ". " + listTemp.get(i)); 
            
        }
    }
}
