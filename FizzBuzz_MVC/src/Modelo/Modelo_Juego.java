package Modelo;

public class Modelo_Juego {

    private int rango1;
    private int rango2;

    public Modelo_Juego() {
    }
    
    

    public Modelo_Juego(int rango1, int rango2) {
        this.rango1 = rango1;
        this.rango2 = rango2;
    }

    public int getRango1() {
        return rango1;
    }

    public void setRango1(int rango1) {
        this.rango1 = rango1;
    }

    public int getRango2() {
        return rango2;
    }

    public void setRango2(int rango2) {
        this.rango2 = rango2;
    }

    public void imprimirMensaje() {
        System.out.println("El juego empieza desde el " + this.rango1 + " hasta el " + this.rango2);
    }

    public void ejecutar() {
        int contador = getRango1();

        for (int i = getRango1(); i <= getRango2(); i++) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (contador % 3 == 0) {
                System.out.println("Fizz");
            } else if (contador % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(contador);
            }
            contador += 1;
        }
        System.out.println("¡JUEGO FINALIZADO!");

    }
}
