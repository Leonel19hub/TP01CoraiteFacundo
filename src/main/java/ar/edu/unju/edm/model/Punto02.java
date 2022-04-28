package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto02 {

    private int anio;

    public Punto02() {
    }

    public Punto02(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean verificarBisiesto(){
        boolean vrfBis = false;
        if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
            vrfBis = true;
        }
        return vrfBis;
    }

    public String esBisiesto(){
        String respuestaAnio="";
        // this.anio cambiar el anio
        if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
            respuestaAnio = "Es un año Bisisesto";
        }
        else{
            respuestaAnio = "No es un año Bisiesto";
        }
        return respuestaAnio;
    }
    
}
