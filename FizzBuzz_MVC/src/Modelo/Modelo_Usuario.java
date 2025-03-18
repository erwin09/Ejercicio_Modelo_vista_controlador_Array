package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo_Usuario {

    private String nombre;
    private String apellidos;
    private ArrayList<String> usuaList;

    public Modelo_Usuario() {
        this.usuaList = new ArrayList<>();
    }

    public Modelo_Usuario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void guardarUsuario(String datoNombre, String datoApellido) {
        this.usuaList.add(datoNombre);
        this.usuaList.add(datoApellido);
    }

    public void mostrarMensaje() {
        System.out.println("El nombre del jugador es: " + this.usuaList.get(0) + " " + this.usuaList.get(1));
    }
}
