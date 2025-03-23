package Comtrolador;

import Modelo.ModeloSensor;
import Vista.VistaSensor;
import java.util.Scanner;

public class ControladorSensorLuces {

    private VistaSensor objVistaSensor;
    private ModeloSensor objModeloSensor;

    public ControladorSensorLuces(VistaSensor objVistaSensor, ModeloSensor objModeloSensor) {
        this.objVistaSensor = objVistaSensor;
        this.objModeloSensor = objModeloSensor;
    }

    public void inciarFormulario() throws InterruptedException {

        System.out.println("Bienvenido al encendido de luces automatico\n");

        while (true) {
            int opcion = this.objVistaSensor.inicioMenu();

            switch (opcion) {
                case 1:
                    boolean esDeNoche = false;
                    boolean hayMovimiento = false;

                    String n = this.objVistaSensor.nocturno();
                    String m = this.objVistaSensor.movimientos();

                    esDeNoche = n.equals("s");
                    hayMovimiento = m.equals("s");

                    objModeloSensor = new ModeloSensor(esDeNoche, hayMovimiento);
                    objModeloSensor.mostrarMensaje();
                    objModeloSensor.activar();

                    Thread.sleep(10000);
                    break;

                case 2:
                    System.out.println("Programa finalizado");
                    return;

                default:
                    System.out.println("Opción invalida");
            }

        }

    }

}
