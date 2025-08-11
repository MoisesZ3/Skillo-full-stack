package br.com.alura.desafio4.sextodesafio;

public class Servico implements Vendavel{
    private double precoBruto;
    private int quantidadeDeProdutos;
    private boolean contaPremion;

    public double getPrecoBruto() {
        return precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public boolean isContaPremion() {
        return contaPremion;
    }

    public void setContaPremion(boolean contaPremion) {
        this.contaPremion = contaPremion;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = precoBruto;
        if (contaPremion == true) {
            precoFinal = precoBruto + 20;
        }
        return precoFinal;

    }
}
