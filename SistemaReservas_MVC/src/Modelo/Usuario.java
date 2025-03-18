
package Modelo;

public class Usuario extends Persona {

    public Usuario() {
        super(null, null);
    }
   
    public Usuario(String datoNombre, String datoDocumento) {
        super(datoNombre, datoDocumento);     
    }


    public void reservar(Sala sala, int numeroAsiento) {
        if (sala.reservarAsiento(numeroAsiento)) {
            System.out.println(getNombre() + " identificado con el N° "+ getDocumento() + " ha reservado el asiento " + numeroAsiento + ".");
        } else { 
            System.out.println("El asiento " + numeroAsiento + " no está disponible.");
        }
    }
    
}
