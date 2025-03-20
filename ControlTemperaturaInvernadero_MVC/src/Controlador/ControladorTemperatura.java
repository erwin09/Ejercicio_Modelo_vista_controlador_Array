package Controlador;

import Modelo.ModeloTemperatura;
import Vista.VistaTemperatura;

public class ControladorTemperatura {

    private VistaTemperatura vistaTemperatura;
    private ModeloTemperatura modeloTemperatura;

    public ControladorTemperatura(VistaTemperatura vistaTemperatura, ModeloTemperatura modeloTemperatura) {
        this.vistaTemperatura = vistaTemperatura;
        this.modeloTemperatura = modeloTemperatura;
    }

    public void iniciarSensor() {
        int opcion = 0;
        do {
            opcion = this.vistaTemperatura.iniciar();
            switch (opcion) {

                case 1:
                    int temp = this.vistaTemperatura.ingresarTemperatura();
                    this.modeloTemperatura = new ModeloTemperatura(temp);
                    this.modeloTemperatura.mostrarMensaje();                    
                    this.modeloTemperatura.cuentaRegresiva();
                    this.modeloTemperatura.validarTemperatura();
                    break;

                case 2:
                    this.modeloTemperatura.mostrarHistorial();
                    break;

                case 3:
                    System.out.println("Programa finalizado");
                    break;
            }

        } while (opcion != 3);
    }
}
