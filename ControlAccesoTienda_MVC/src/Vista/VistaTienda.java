package Vista;

import java.util.Scanner;

public class VistaTienda {

    private Scanner sc;

    public boolean aperturaTienda() {
        sc = new Scanner(System.in);
        System.out.print("¿La tienda está abierta? (true/false): ");
        boolean horarioAtencion = sc.nextBoolean();
        return horarioAtencion;
    }

    public int menu() {
        sc = new Scanner(System.in);
        System.out.println("\n1. Registrar Cliente");
        System.out.println("2. Registrar Empleado");
        System.out.println("3. Verificar acceso");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public String ingresoCliente() {
        sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        return nombreCliente;
    }

    public String registroEmpleado() {
        sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = sc.nextLine();
        return nombreEmpleado;
    }

    public boolean membresia() {
        sc = new Scanner(System.in);
        System.out.print("¿Tiene membresía? (true/false): ");
        boolean tieneMembresia = sc.nextBoolean();
        return tieneMembresia;
    }

    public void mensaje() {
        System.out.println("Registro con éxito.");
    }
}
