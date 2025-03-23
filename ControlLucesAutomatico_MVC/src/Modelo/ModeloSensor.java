package Modelo;

public class ModeloSensor extends ModeloLuces {

    public ModeloSensor() {
        super(false, false);
    }
    

    public ModeloSensor(boolean noche, boolean movimiento) {
        super(noche, movimiento);
    }

    public void activar() {
        if (isMovimiento() && isNoche()) {
            System.out.println("Activar las luces");
        } else {
            System.out.println("luces apagadas");
        }
    }

}
