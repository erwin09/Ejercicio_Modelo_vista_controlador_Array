package Vista;

import java.util.Scanner;

public class VistaAlarma {

    private Scanner sc;

    public int iniciarMenu() {
        sc = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Alarma \n");
        System.out.print("\nMenú\n"
                + "1. Activar alarma \n"
                + "2. Desactivar alarma \n"
                + "Ingrese una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public int activarAlarma() {
        sc = new Scanner(System.in);

        System.out.println("\n¡Alarma activada!");
        System.out.println("\nActivar sensores\n"
                + "Cuantos sensores activaras: ");
        int cant = sc.nextInt();
        return cant;
    }
}
