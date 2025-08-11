package br.com.alura.desafio4.quartodesafio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius  = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
}
