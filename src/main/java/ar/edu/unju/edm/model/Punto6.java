package ar.edu.unju.edm.model;

public class Punto6 {
    private int nota;

    public Punto6() {
    }

    public Punto6(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String verificarNota(int nota){
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
