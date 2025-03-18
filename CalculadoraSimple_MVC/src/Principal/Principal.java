
package Principal;

import Controlador.ControladorCalculadora;
import Modelo.ModeloCalculadora;
import Vista.VistaCalculadora;

public class Principal {

    public static void main(String[] args) {
        
        ModeloCalculadora objModeloCalculadora = new ModeloCalculadora();
        VistaCalculadora obVistaCalculadora = new VistaCalculadora();
        
        ControladorCalculadora objCalculadora = new ControladorCalculadora(obVistaCalculadora, objModeloCalculadora);
        objCalculadora.iniciarCalculador();
        
    }
    
}
