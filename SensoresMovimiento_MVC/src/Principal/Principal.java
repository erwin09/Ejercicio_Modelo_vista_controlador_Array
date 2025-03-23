
package Principal;

import Controlador.ControladorAlarma;
import Modelo.ModeloAlarma;
import Vista.VistaAlarma;


public class Principal {

   
    public static void main(String[] args) {
        
        ModeloAlarma objAlarma = new ModeloAlarma();
        VistaAlarma objVistaAlarma = new VistaAlarma();
        ControladorAlarma objControladorAlarma = new ControladorAlarma(objVistaAlarma, objAlarma);
        objControladorAlarma.iniciarAlarma();
        
    }
    
}
