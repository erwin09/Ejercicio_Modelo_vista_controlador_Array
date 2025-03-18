package Principal;

import Controlador.Controlador_Juego;
import Modelo.Modelo_Juego;
import Modelo.Modelo_Usuario;
import Vista.Vista_Juego;

public class Principal {

    public static void main(String[] args) {

        Modelo_Juego objJuego = new Modelo_Juego();
        Modelo_Usuario objUsuario =new Modelo_Usuario();
        Vista_Juego objVista_Juego = new Vista_Juego();
        
        Controlador_Juego objControlador_Juego = new Controlador_Juego(objJuego, objVista_Juego, objUsuario);
        objControlador_Juego.registroUsuario();
        objControlador_Juego.iniciarJuego();

    }

}
