
package Principal;

import Controlador.ControladorSensor;
import Modelo.ModeloSensor;
import Vista.VistaSensor;


public class Principal {

    public static void main(String[] args) {
        
        ModeloSensor objModeloSensor = new ModeloSensor();
        VistaSensor objVistaSensor = new VistaSensor();
        
        ControladorSensor objControladorSensor = new ControladorSensor(objVistaSensor, objModeloSensor);
        objControladorSensor.inciarSensor();
        
    }
    
}
