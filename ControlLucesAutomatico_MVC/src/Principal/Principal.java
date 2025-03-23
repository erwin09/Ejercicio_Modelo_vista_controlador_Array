
package Principal;

import Comtrolador.ControladorSensorLuces;
import Modelo.ModeloSensor;
import Vista.VistaSensor;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        VistaSensor objVistaSensor = new VistaSensor();
        ModeloSensor objModeloSensor = new ModeloSensor();
        
        ControladorSensorLuces objControladorSensorLuces = new ControladorSensorLuces(objVistaSensor, objModeloSensor);
        objControladorSensorLuces.inciarFormulario();
        
    }
    
}
