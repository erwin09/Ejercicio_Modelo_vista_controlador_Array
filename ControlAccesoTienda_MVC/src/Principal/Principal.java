
package Principal;

import Controlador.ControladorTienda;
import Modelo.ModeloCliente;
import Modelo.ModeloTienda;
import Vista.VistaTienda;


public class Principal {

    public static void main(String[] args) {
        
        VistaTienda objVistaTienda = new VistaTienda();
        ModeloTienda objModeloTienda = new ModeloTienda();
        ModeloCliente objModeloCliente = new ModeloCliente();
        
        ControladorTienda objControladorTienda = new ControladorTienda(objVistaTienda, objModeloTienda, objModeloCliente);
        objControladorTienda.ingresoTienda();
    }
    
}
