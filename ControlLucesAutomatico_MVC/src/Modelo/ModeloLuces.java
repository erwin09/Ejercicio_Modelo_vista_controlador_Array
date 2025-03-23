
package Modelo;

public class ModeloLuces {
    private boolean noche;
    private boolean movimiento;

    public ModeloLuces(boolean noche, boolean movimiento) {
        this.noche = noche;
        this.movimiento = movimiento;
    }

    public boolean isNoche() {
        return noche;
    }

    public void setNoche(boolean noche) {
        this.noche = noche;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
    
    public void mostrarMensaje(){
        if(noche == true){
            System.out.println("\nEs de noche\n");
        }else{
            System.out.println("\nEs de dia\n");
        }
    }
}
