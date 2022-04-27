package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto09 {
    private int num;

    public Punto09() {
    }

    public Punto09(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String punto09ConFor(){
        String resultadoString = "";

        for(int i = 320;i>=160;i = i-20){
            resultadoString = resultadoString + Integer.toString(i)+" - ";
        }

        return resultadoString;
    }
}
