package Controlador;

import Modelo.Usuario;
import Modelo.Sala;
import Vista.Vista_Cine;

public class Controlador_Cine {

    private Vista_Cine objVista_Cine;
    private Sala objSala;
    private Usuario objUsuario;

    public Controlador_Cine(Vista_Cine objVista_Cine, Sala objSala, Usuario objUsuario) {
        this.objVista_Cine = objVista_Cine;
        this.objSala = objSala;
        this.objUsuario = objUsuario;
    }

    public void iniciarReserva() {
        int opcion = 0;

        do {
            opcion = this.objVista_Cine.menuPrincipal();

            switch (opcion) {
                case 1:
                    while (this.objSala.hayDisponibilidad()) {
                        this.objSala.mostrarAsientos();

                        String[] auxUsuario = this.objVista_Cine.registroUsuario();
                        this.objUsuario = new Usuario(auxUsuario[0], auxUsuario[1]);

                        int cantidad = this.objVista_Cine.registrar_cantidadAsientos();

                        for (int i = 1; i <= cantidad; i++) {
                            this.objSala.mostrarAsientos();
                            int numAsiento = this.objVista_Cine.registrar_numeroAsiento();
                            this.objUsuario.reservar(this.objSala, numAsiento);
                        }

                        String continuar = this.objVista_Cine.reinciarFormulario();
                        if (!continuar.equals("s")) {
                            break;
                        }
                    }
                case 2:
                    System.out.println("¡Programa finalizado!");
            }

            System.out.println("No hay más asientos disponibles o decidió salir.");

        } while (opcion != 2);

    }
}
