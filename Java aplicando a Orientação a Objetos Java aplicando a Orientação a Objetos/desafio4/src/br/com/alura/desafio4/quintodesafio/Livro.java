package br.com.alura.desafio4.quintodesafio;

public class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double bruto) {
        double precoComTaxa = bruto + (bruto * 0.25);
        double precoComDesconto = precoComTaxa - (precoComTaxa * 0.05) ;
        return precoComDesconto;
    }
}
