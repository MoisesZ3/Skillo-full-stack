package br.com.alura.desafio3.primos;

import java.util.Random;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarNumeroPrimo(int minimo, int maximo) {
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(maximo - minimo + 1) + minimo;
    }

    public void gerarProximoPrimo() {
        int numeroGerado = gerarNumeroPrimo(1, 1000);
        double verificarNumero = numeroGerado;
        while (verificarNumero > 0) {
            verificarNumero--;
            double calculo = numeroGerado % verificarNumero;
            if (verificarNumero == 1) {
                System.out.println(numeroGerado);
                break;
            } if (calculo == 0 || numeroGerado == 1) {
                numeroGerado = gerarNumeroPrimo(1, 1000);
            }
        }
    }
}