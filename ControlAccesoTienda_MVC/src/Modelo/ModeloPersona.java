package Modelo;

public class ModeloPersona {

    String nombre;

    public ModeloPersona(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedeEntrar(boolean horarioAtencion) {
        return false;
    }
}
