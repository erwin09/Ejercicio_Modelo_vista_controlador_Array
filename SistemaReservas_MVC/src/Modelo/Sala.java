
package Modelo;

import java.util.ArrayList;
import java.util.List;

 public class Sala {
    
     int totalAsientos = 20;
    private List<Asiento> asientos;

    public Sala() {
        asientos = new ArrayList<>();
        for (int i = 1; i <= totalAsientos; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public void mostrarAsientos() {
        System.out.print("\nAsientos disponibles: ");
        for (Asiento asiento : asientos) {
            if (asiento.isReservado() == false) {
                System.out.print(asiento.getNumeroAsiento() + " ");
            }
        }
        System.out.println("\n ");
    }

    public boolean reservarAsiento(int numero) {
        if (numero >= 1 && numero <= asientos.size()) {
            Asiento asiento = asientos.get(numero -1);
            return asiento.reservar();
        }
        return false;
    }

    public boolean hayDisponibilidad() {
        for (Asiento asiento : asientos) {
            if (asiento.isReservado() == false) {
                return true;
            }
        }
        return false;
    }
     
}
