
package Modelo;


public class ModeloEmpleado extends ModeloPersona{
    
    public ModeloEmpleado(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeEntrar(boolean horarioAtencion) {
        return true; // Los empleados siempre pueden entrar
    }
}
