package Controlador;

import Modelo.Modelo_Juego;
import Modelo.Modelo_Usuario;
import Vista.Vista_Juego;

public class Controlador_Juego {

    private Modelo_Juego objJuego;
    private Vista_Juego objVista_Juego;
    private Modelo_Usuario objUsuario;

    public Controlador_Juego(Modelo_Juego objJuego, Vista_Juego objVista_Juego, Modelo_Usuario objUsuario) {
        this.objJuego = objJuego;
        this.objVista_Juego = objVista_Juego;
        this.objUsuario = objUsuario;
    }

    public void registroUsuario() {
        String[] aux = this.objVista_Juego.mostrarInicio();
        this.objUsuario.guardarUsuario(aux[0], aux[1]);
    }

    public void iniciarJuego() {
        int opcion = 0;

        do {
            opcion = this.objVista_Juego.iniciarFormulario();
            switch (opcion) {
                case 1:
                    this.objUsuario.mostrarMensaje();
                    int rango1 = this.objVista_Juego.registroRango1();
                    int rango2 = this.objVista_Juego.registroRango2();
                    this.objJuego = new Modelo_Juego(rango1, rango2);
                    this.objJuego.imprimirMensaje();
                    this.objJuego.ejecutar();
                    break;
                case 2:
                    System.out.println("Programa finalizada.");
            }
        } while (opcion != 2);
    }

}
