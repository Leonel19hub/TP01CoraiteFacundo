package ar.edu.unju.edm.model;

public class EsPar {
    private int numeroPar;

    public EsPar(){

    }

    public EsPar(int numeroPar) {
        this.numeroPar = numeroPar;
    }

    public int getNumeroPar() {
        return numeroPar;
    }

    public void setNumeroPar(int numeroPar) {
        this.numeroPar = numeroPar;
    }

    public boolean verifacarPar(int numeroPar){
        boolean trueFalse = false;
        if(numeroPar % 2 == 0){
            trueFalse = true;
        }
        return trueFalse;
    }
  }
