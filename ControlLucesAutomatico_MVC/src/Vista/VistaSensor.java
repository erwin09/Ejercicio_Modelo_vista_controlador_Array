package Vista;

import java.util.Scanner;

public class VistaSensor {

    private Scanner sc;

    public int inicioMenu() {
        sc = new Scanner(System.in);

        System.out.print("\nMenú\n"
                + "1. Activar encendido automatico\n"
                + "2. Salir del programa \n"
                + "\nElige una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public String nocturno() {
        sc = new Scanner(System.in);
        System.out.println("\nIngrese si es de noche: s/n");
        String n = sc.next().toLowerCase();
        return n;
    }

    public String movimientos() {
        System.out.println("Ingrese si hay algún movimiento: s/n");
        String m = sc.next().toLowerCase();
        return m;
    }
}
