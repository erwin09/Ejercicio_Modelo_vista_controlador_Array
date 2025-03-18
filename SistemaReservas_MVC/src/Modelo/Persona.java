
package Modelo;

public class Persona {
    
     private String Nombre;
    private String Documento;

    public Persona(String datoNombre, String datoDocumento) {
        this.Nombre = datoNombre;
        this.Documento = datoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    
}
