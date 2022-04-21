package ar.edu.unju.edm.model;

// import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

public class MesAnual {
    private int numMes;

    public MesAnual() {
    }

    public MesAnual(int numMes) {
        this.numMes = numMes;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }

    public String esMesDelAnio(int numMes){
        String answer = "";
        if(numMes == 1){
            // System.out.println("Mes de Enero");
            answer = "Enero";
        }
        else{
            if(numMes == 2){
                answer = "Febrero";
            }
            else{
                if(numMes == 3){
                    answer = "Marzo";
                }
                else{
                    if(numMes == 4){
                        answer = "Abril";
                    }
                    else{
                        if(numMes == 5){
                            answer = "Mayo";
                        }
                        else{
                            if(numMes == 6){
                                answer = "Junio";
                            }
                            else{
                                if(numMes == 7){
                                    answer = "Julio";
                                }
                                else{
                                    if(numMes == 8){
                                        answer = "Agosto";
                                    }
                                    else{
                                        if(numMes == 9){
                                            answer = "Septiembre";
                                        }
                                        else{
                                            if(numMes == 10){
                                                answer = "Octubre";
                                            }
                                            else{
                                                if(numMes == 11){
                                                    answer = "Noviembre";
                                                }
                                                else{
                                                    if(numMes == 12){
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

    public String verificarMesSwitch(int numMes){
        String answer = "";

        switch(numMes){
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
