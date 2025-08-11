package br.com.alura.desafio4.quintodesafio;

public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double bruto) {
        double precoComTaxa = bruto + (bruto * 0.5);
        double precoComDesconto = precoComTaxa - (precoComTaxa * 0.15) ;
        return precoComDesconto;
    }
}
