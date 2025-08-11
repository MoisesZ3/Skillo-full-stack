package br.com.alura.desafio4.terceirodesafio;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        int tabuada = 1;
        while ( tabuada != 11){
            int resultado = numero * tabuada;
            System.out.println(numero + " X " + tabuada + " = " + resultado);
            tabuada++;
        }
    }
}
