package Controlador;

import Modelo.ModeloSensor;
import Vista.VistaSensor;

public class ControladorSensor {

    private VistaSensor objVistaSensor;
    private ModeloSensor objModeloSensor;

    public ControladorSensor(VistaSensor objVistaSensor, ModeloSensor objModeloSensor) {
        this.objVistaSensor = objVistaSensor;
        this.objModeloSensor = objModeloSensor;
    }
    

    public void inciarSensor() {

        int opcion = 0;

        do {

            opcion = this.objVistaSensor.menu();

            switch (opcion) {
                case 1:
                    double temp = this.objVistaSensor.ingresarTemperatura();
                    double hum = this.objVistaSensor.ingresarHumedad();
                    objModeloSensor = new ModeloSensor(temp, hum);
                    objModeloSensor.mensaje();
                    objModeloSensor.calcular();
                    break;

                case 2:
                    objModeloSensor.mostrarTemp();
                    break;

                case 3:
                    System.out.println("Programa Finalizado.");
                    break;

                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } while (opcion != 3);
    }
}
