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

    //  EN PROSESO DE RESOLUCION!!!!!!
    // public void punto7(){
    //     boolean condicion = true;
    //     for(int i=2;condicion = false;i++){

    //     }
    // }

    public void punto8(){
        // int i = 1;
        // do{
        //     if(i % 4 == 0){
        //         System.out.println(i+" - ");
        //         i++;

        //     }
        // }while(i != 100);
        System.out.println("Comprobando punto 8");
    }
}
