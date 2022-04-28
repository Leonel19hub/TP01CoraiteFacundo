package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto04 {

    private int mes;

    public Punto04() {
    }

    public Punto04(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    
    public String esMesDelAnio(){
        String answer = "";
        if(mes == 1){
            // System.out.println("Mes de Enero");
            answer = "Enero";
        }
        else{
            if(mes == 2){
                answer = "Febrero";
            }
            else{
                if(mes == 3){
                    answer = "Marzo";
                }
                else{
                    if(mes == 4){
                        answer = "Abril";
                    }
                    else{
                        if(mes == 5){
                            answer = "Mayo";
                        }
                        else{
                            if(mes == 6){
                                answer = "Junio";
                            }
                            else{
                                if(mes == 7){
                                    answer = "Julio";
                                }
                                else{
                                    if(mes == 8){
                                        answer = "Agosto";
                                    }
                                    else{
                                        if(mes == 9){
                                            answer = "Septiembre";
                                        }
                                        else{
                                            if(mes == 10){
                                                answer = "Octubre";
                                            }
                                            else{
                                                if(mes == 11){
                                                    answer = "Noviembre";
                                                }
                                                else{
                                                    if(mes == 12){
                                                        answer = "Diciembre";
                                                    }
                                                    else{
                                                        answer = "No pertenece a ningun mes del año";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }

    public String verificarMesSwitch(){
        String answer = "";

        switch(mes){
            case 1: answer = "Enero"; break;
            case 2: answer = "Febrero"; break;
            case 3: answer = "Marzo"; break;
            case 4: answer = "Abril"; break;
            case 5: answer = "Mayo"; break;
            case 6: answer = "Junio"; break;
            case 7: answer = "Julio"; break;
            case 8: answer = "Agosto"; break;
            case 9: answer = "Septiembre"; break;
            case 10: answer = "Octubre"; break;
            case 11: answer = "Noviembre"; break;
            case 12: answer = "Diciembre"; break;
            default: answer = "No pertenece a ningun mes del año";
        }
        return answer;
    }
    
}
