package Vista;

import java.util.Scanner;

public class Vista_Cine {

    private Scanner sc;

    public int menuPrincipal() {

        System.out.println("Bienvenido al sistema de reservas.");
        System.out.println("Menú: \n"
                + "1. Hacer reserva.  \n"
                + "2. Salir.");
        this.sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        return opcion;
    }

    public String[] registroUsuario() {
        this.sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese documento de identidad: ");
        String documento = sc.next();
        return new String[]{nombre, documento};
    }

    public int registrar_cantidadAsientos() {
        this.sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de asientos que desea reservar: ");
        int cantidad = sc.nextInt();
        return cantidad;
    }

    public int registrar_numeroAsiento() {
        this.sc = new Scanner(System.in);
        System.out.print("Escoge la silla: ");
        int numeroAsiento = sc.nextInt();
        return numeroAsiento;
    }

    public String reinciarFormulario() {
        this.sc = new Scanner(System.in);
        System.out.print("¿Desea hacer otra reserva? (s/n): ");
        String continuar = sc.nextLine().toLowerCase();
        return continuar;

    }
}
