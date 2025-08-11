package br.com.alura.desafio4.primeirodesafio;

public class ConversorMoeda implements ConversorFinanceiro {
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.43;
    }
}
