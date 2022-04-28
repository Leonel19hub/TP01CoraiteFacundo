package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {

    public String punto11DoWhile(){

        String resultadoString = "";
        int i=320;
        do{
            resultadoString = resultadoString + Integer.toString(i) + " . ";
            i = i - 20;
        }while(i >= 160);

        return resultadoString;
    }

}
