package ar.edu.unju.edm.model;

public class Factorial {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public Factorial() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int calcularFactorial(int num){
        int factorial = 1;
        int i = num;
        
        while(i != 0){
            factorial = factorial*i;
            i--;
        }

        return factorial;
    }
}
