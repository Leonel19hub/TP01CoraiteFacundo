package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {
    
    public String punto10ConWhile(){
        String resultadoString = "";
        int i = 320;

        while(i >= 160){
            resultadoString = resultadoString + Integer.toString(i) + " - ";
            i = i - 20;
        }

        return resultadoString;
    }

}
