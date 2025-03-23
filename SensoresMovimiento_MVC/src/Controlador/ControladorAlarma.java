package Controlador;

import Modelo.ModeloAlarma;
import Vista.VistaAlarma;

public class ControladorAlarma {

    private VistaAlarma objVistaAlarma;
    private ModeloAlarma objAlarma;

    public ControladorAlarma(VistaAlarma objVistaAlarma, ModeloAlarma objAlarma) {
        this.objVistaAlarma = objVistaAlarma;
        this.objAlarma = objAlarma;
    }
       
    
    public void iniciarAlarma() {
        int opcion = 0;
        do {
            opcion = objVistaAlarma.iniciarMenu();
            switch (opcion) {
                case 1:                
                    int cant = objVistaAlarma.activarAlarma();

                    for (int i = 0; i < cant; i++) {

                        int num = i + 1;
                        objAlarma.activarSensor(num);
                    }
                    objAlarma.mostrarMensaje();
                    objAlarma.iniciarSensores();
                    break;
                case 2:
                    System.out.println("\nAlarma desactivada");
                    break;
                default:
                    System.out.println("\nEntrada invalida");
            }
        } while (opcion != 2);

    }

}
