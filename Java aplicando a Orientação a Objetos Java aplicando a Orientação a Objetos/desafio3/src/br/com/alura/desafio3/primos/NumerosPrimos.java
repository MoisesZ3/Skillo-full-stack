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
        int verificaNumero = numero;
        while (verificaNumero > 1) {
            verificaNumero--;
            if (numero / verificaNumero != 1) {
                System.out.println("É um numero primo");
                break;
            } else {
                System.out.println("Não é um numero primo");
                break;
            }
        }
    }

}
