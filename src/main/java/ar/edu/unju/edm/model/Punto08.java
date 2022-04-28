package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto08 {
    private int num1;

    public Punto08() {
    }

    public Punto08(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String generarMultiplos(){
        String resultadoString = "";
        int resultadoInteger = 1;
        int factorMultiplicador = 1;
        do{
            resultadoInteger = num1 * factorMultiplicador;
            factorMultiplicador *= 1;
            resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
        }while((resultadoInteger = num1) < 100);
        return resultadoString;
    }
}
