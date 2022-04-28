package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto06 {
    private int nota;

    public Punto06() {
    }

    public Punto06(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String verificarNota(){
        String answer = "";

        if(nota == 6){
            answer = "Regulariza";
        }
        else{
            if(nota >= 7 && nota <= 10){
                answer = "Promociona";
            }
            else{
                if(nota <= 6 && nota >= 1){
                    answer = "Desaprueba";
                }
                else{
                    if(nota == 0){
                        answer = "VALOR NO PERMITIDO!";
                    }
                }
            }
        }

        return answer;
    }
}
