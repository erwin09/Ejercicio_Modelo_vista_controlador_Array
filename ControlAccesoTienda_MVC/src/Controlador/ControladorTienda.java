package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloEmpleado;
import Modelo.ModeloPersona;
import Modelo.ModeloTienda;
import Vista.VistaTienda;
import java.util.ArrayList;

public class ControladorTienda {

    ArrayList<ModeloPersona> personas = new ArrayList<>();
    VistaTienda objVistaTienda;
    ModeloTienda objModeloTienda;
    ModeloCliente objModeloCliente;

    public ControladorTienda(VistaTienda objVistaTienda, ModeloTienda objModeloTienda, ModeloCliente objModeloCliente) {
        this.objVistaTienda = objVistaTienda;
        this.objModeloTienda = objModeloTienda;
        this.objModeloCliente = objModeloCliente;
    }

    
    public void ingresoTienda() {

        boolean horarioAtencion = this.objVistaTienda.aperturaTienda();
        objModeloTienda = new ModeloTienda(horarioAtencion);

        while (true) {
            
            int opcion = this.objVistaTienda.menu();

            switch (opcion) {
                case 1:
                    String nombreCliente = this.objVistaTienda.ingresoCliente();
                    boolean tieneMembresia = this.objVistaTienda.membresia();
                    personas.add(new ModeloCliente(nombreCliente, tieneMembresia));
                    this.objVistaTienda.mensaje();
                    break;

                case 2:
                    String nombreEmpleado = this.objVistaTienda.registroEmpleado();
                    personas.add(new ModeloEmpleado(nombreEmpleado));
                    this.objVistaTienda.mensaje();
                    break;

                case 3:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        System.out.println("\nVerificación de acceso:");
                        for (ModeloPersona p : personas) {
                            objModeloTienda.permitirAcceso(p);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

    }

}
