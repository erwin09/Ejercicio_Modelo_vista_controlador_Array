package Controlador;

import Modelo.ModeloCalculadora;
import Vista.VistaCalculadora;
import java.util.ArrayList;

public class ControladorCalculadora {

    private VistaCalculadora objCalculadora;
    private ModeloCalculadora objModeloCalculadora;
    

    public ControladorCalculadora() {
    }

    public ControladorCalculadora(VistaCalculadora objCalculadora, ModeloCalculadora objModeloCalculadora) {
        this.objCalculadora = objCalculadora;
        this.objModeloCalculadora = objModeloCalculadora;
    }

    public void iniciarCalculador() {
        int opcion = 0;

        do {
            opcion = objCalculadora.iniciarCalculadora();

            switch (opcion) {
                case 1:
                    String opc = objCalculadora.operacion();
                    int[] aux = objCalculadora.ingresarNumero();
                    objModeloCalculadora = new ModeloCalculadora(aux[0], aux[1]);

                    switch (opc) {
                        case "+":
                            objModeloCalculadora.suma();
                            objModeloCalculadora.imprimirResultado(opc);
                            
                            break;
                        case "-":
                            objModeloCalculadora.resta();
                            objModeloCalculadora.imprimirResultado(opc);
                            
                            break;
                        case "*":
                            objModeloCalculadora.multiplicacion();
                            objModeloCalculadora.imprimirResultado(opc);
                            
                            break;
                        case "/":
                            objModeloCalculadora.division();
                            objModeloCalculadora.imprimirResultado(opc);
                            
                            break;
                        default:
                            System.out.println("Operación no válida");
                            break;

                    }
                    break;
                case 2: 
                    objModeloCalculadora.mostrarHistorial();
                    break;
                case 3:
                    System.out.println("¡Finalizo el juego!");
                    break;
            }
        } while (opcion != 3);
    }

}
