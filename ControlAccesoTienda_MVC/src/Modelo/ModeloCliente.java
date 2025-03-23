
package Modelo;


public class ModeloCliente extends ModeloPersona{
    
     boolean tieneMembresia;

    public ModeloCliente() {
        super(null);
    }

    public ModeloCliente(String nombre, boolean tieneMembresia) {
        super(nombre);
        this.tieneMembresia = tieneMembresia;
    }

    @Override
    public boolean puedeEntrar(boolean horarioAtencion) {
        return tieneMembresia && horarioAtencion;
    }
}
