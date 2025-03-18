package Modelo;

import java.util.ArrayList;

public class ModeloCalculadora {

    private int numero1;
    private int numero2;
    static ArrayList<Integer> resultList = new ArrayList<>();

    public ModeloCalculadora() {
    }

    
    public ModeloCalculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma() {
        int aux = getNumero1() + getNumero2();
        return aux;
    }

    public int resta() {
        int aux = getNumero1() - getNumero2();
        return aux;
    }

    public int multiplicacion() {
        int aux = getNumero1() * getNumero2();
        return aux;
    }

    public int division() {
        int aux = getNumero1() / getNumero2();
        return aux;
    }
    
        public void imprimirResultado(String operacion){
        switch (operacion) {
        case "+":
            System.out.println("Suma: " + suma());
            this.resultList.add(suma());
            break;
        case "-":
            System.out.println("Resta: " + resta());
            this.resultList.add(resta());
            break;
        case "*":
            System.out.println("Multiplicación: " + multiplicacion());
            this.resultList.add(multiplicacion());
            break;
        case "/":
            if (numero2 != 0) {
                System.out.println("División: " + division());
                this.resultList.add(division());
            } else {
                System.out.println("División: No se puede dividir por cero");
            }
            break;
        default:
            System.out.println("Operación no válida");
    }
    }
        
        public void mostrarHistorial(){
            System.out.println("El historial de resultados es : ");
            for (int i = 0; i < resultList.size(); i++) {
                 System.out.println(" " + resultList.get(i));
            }
        }

}
