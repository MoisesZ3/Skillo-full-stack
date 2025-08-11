package br.com.alura.desafio4.sextodesafio;

public class Produto implements Vendavel {
    private int quantidadeDeProdutos;
    private double precoBruto;

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoDesconto = precoBruto;
        if (quantidadeDeProdutos >= 5) {
            precoDesconto = precoBruto - (precoBruto * 0.1);
        }
        return precoDesconto * quantidadeDeProdutos;
    }
}
