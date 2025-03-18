
package Modelo;

public class Asiento {
    
    
    private int numeroAsiento;
    private boolean Reservado;

    public Asiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.Reservado = false;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public boolean reservar() {
        if (Reservado == false) {
            Reservado = true;
            return true;
        } else {
            return false;
        }
    }
}
