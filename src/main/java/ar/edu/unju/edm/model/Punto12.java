package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {
    private double altura;

    public Punto12() {
    }

    public Punto12(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calculoTiempo(){
        String resultadoString = "";
        double fistOperation = (2 * altura) / 9.81;
        double tiempo = Math.sqrt(fistOperation);;

        resultadoString = " "+tiempo;

        return resultadoString;
    }
}
