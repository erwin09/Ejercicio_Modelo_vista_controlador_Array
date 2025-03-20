package Vista;

import java.util.Scanner;

public class VistaTemperatura {

    private Scanner sc;

    public int iniciar() {
        sc = new Scanner(System.in);
        System.out.println("Menu\n"
                + "1. Ingresar al sensor \n"
                + "2. Mostrar historial de temperaturas \n"
                + "3. Salir del programa \n");
        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }
    
    public int ingresarTemperatura(){
        sc = new Scanner(System.in);
        System.out.print("\nIngrese la temperatura en grados C° del invernadero: ");
        int temp = sc.nextInt();
        return temp;
    }

}
