package Vista;

import java.util.Scanner;

public class VistaCalculadora {

    private Scanner sc;

    public int iniciarCalculadora() {
        sc = new Scanner(System.in);
        System.out.print("\nMenú: \n"
                + "1. Calculadora \n"
                + "2. Ver historal de resultados \n"
                + "3. Salir \n"
                + "Escoge una opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }
    
    public String operacion(){
        sc = new Scanner(System.in);
        System.out.println("Escoge la operación que desea hacer: + , - , * , /");
                    String opc = sc.next();
                    return opc;
    }
    
   public int [] ingresarNumero(){
       sc= new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Ingrese un numero: ");
                    int num2 = sc.nextInt();
                    return new int[]{num1, num2};
   }
}
