package br.com.alura.desafio3.primos;

public class NumerosPrimos {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void verificarPrimalidade() {
        double verificarNumero = numero;
        while (verificarNumero > 0) {
            verificarNumero--;
            double calculo = numero % verificarNumero;
            if (verificarNumero == 1) {
                System.out.println(numero + " é um numero primo.");
                break;
            } if (calculo == 0 || numero == 1) {
                    System.out.println(numero + " não é um numero primo.");
                    break;
            }
        }
    }
}


