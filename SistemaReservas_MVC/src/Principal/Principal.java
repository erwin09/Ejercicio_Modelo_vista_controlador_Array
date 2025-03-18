package Principal;

import Controlador.Controlador_Cine;
import Modelo.Sala;
import Vista.Vista_Cine;
import Modelo.Usuario;

public class Principal {

    public static void main(String[] args) {

        Sala objSala = new Sala();
        Vista_Cine objVista_Cine = new Vista_Cine();
        Usuario objUsuario = new Usuario();

        Controlador_Cine objControlador_Cine = new Controlador_Cine(objVista_Cine, objSala, objUsuario);
        objControlador_Cine.iniciarReserva();

    }

}
