
package Modelo;


public class ModeloTienda {
    
      boolean horarioAtencion;

    public ModeloTienda() {
    }

    public ModeloTienda(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public void permitirAcceso(ModeloPersona persona) {
        if (persona.puedeEntrar(horarioAtencion)) {
            System.out.println(persona.nombre + " puede entrar.");
        } else {
            System.out.println(persona.nombre + " NO puede entrar.");
        }
    }
}
