package Vista;

import java.util.Scanner;

public class VistaSensor {

    private Scanner sc;

    public int menu() {
        sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Menü");
        System.out.println("1. ingresar al sistema.\n"
                + "2. mostrar temperaturas \n"
                + "3. Salir del sistema \n"
                + "Ingrese una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public double ingresarTemperatura() {
        sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        double temperatura = sc.nextDouble();
        return temperatura;
    }

    public double ingresarHumedad() {
        sc = new Scanner(System.in);
        System.out.println("Ingrese la humedad: ");
        double humedad = sc.nextDouble();
        return humedad;
    }

}
