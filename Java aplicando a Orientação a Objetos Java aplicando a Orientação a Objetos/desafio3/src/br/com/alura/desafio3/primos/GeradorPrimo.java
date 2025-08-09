package br.com.alura.desafio3.primos;

import java.util.Random;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarNumeroPrimo(int minimo, int maximo) {
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(maximo - minimo + 1) + minimo;
    }

    public void gerarProximoPrimo() {
        int numerogerado = gerarNumeroPrimo(1, 100);
        double verificarNumero = numerogerado;
        while (verificarNumero > 0) {
            verificarNumero--;
            double calculo = numerogerado % verificarNumero;
            if (verificarNumero == 1) {
                System.out.println(numerogerado);
                break;
            } else {
                if (calculo == 0 || numerogerado == 1) {
                }
            }
        }
    }
}