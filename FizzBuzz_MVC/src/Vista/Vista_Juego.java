package Vista;

import java.util.Scanner;

public class Vista_Juego {

    private Scanner sc;

    public String[] mostrarInicio() {
        sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego Fizz Buzz");
        System.out.println("Debes ingresar un rango en el que juego recorrera.");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        return new String[]{nombre, apellido};

    }

    public int iniciarFormulario() {
        sc = new Scanner(System.in);
        System.out.print("\nMenú  \n"
                + "1. Iniciar el juego. \n"
                + "2. Salir. \n"
                + "Escoge una opción:");
        int opcion = sc.nextInt();
        return opcion;
    }

    public int registroRango1() {
        sc = new Scanner(System.in);
        System.out.print("Ingrese el numero desde donde inicia: ");
        int rango1 = sc.nextInt();
        return rango1;

    }

    public int registroRango2() {
        sc = new Scanner(System.in);
        System.out.print("Ingrese el numero donde termina: ");
        int rango2 = sc.nextInt();
        return rango2;
    }
}
