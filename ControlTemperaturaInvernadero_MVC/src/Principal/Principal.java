package Principal;

import Controlador.ControladorTemperatura;
import Modelo.ModeloTemperatura;
import Vista.VistaTemperatura;

public class Principal {

    public static void main(String[] args) {
        
        ModeloTemperatura modeloTemperatura = new ModeloTemperatura();
        VistaTemperatura vistaTemperatura = new VistaTemperatura();
        ControladorTemperatura controladorTemperatura = new ControladorTemperatura(vistaTemperatura, modeloTemperatura);
        controladorTemperatura.iniciarSensor();
        
    }

}
