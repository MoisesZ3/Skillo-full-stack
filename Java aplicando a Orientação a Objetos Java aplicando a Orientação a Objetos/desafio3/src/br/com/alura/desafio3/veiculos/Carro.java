package br.com.alura.desafio3.veiculos;

public class Carro {
    private String marca;
    private String modelo;
    private int anoDeLancamento;
    private double precoPrimeiroAno;
    private double precoSegundoAno;
    private double precoTerceiroAno;

    public String getMarca(String chevrolet) {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getPrecoPrimeiroAno() {
        return precoPrimeiroAno;
    }

    public void setPrecoPrimeiroAno(double precoPrimeiroAno) {
        this.precoPrimeiroAno = precoPrimeiroAno;
    }

    public double getPrecoSegundoAno() {
        return precoSegundoAno;
    }

    public void setPrecoSegundoAno(double precoSegundoAno) {
        this.precoSegundoAno = precoSegundoAno;
    }

    public double getPrecoTerceiroAno() {
        return precoTerceiroAno;
    }

    public void setPrecoTerceiroAno(double precoTerceiroAno) {
        this.precoTerceiroAno = precoTerceiroAno;
    }

    public void exibirFichaCarro () {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anoDeLancamento);
    }

public void menorMaior(){
        double menorValor = Math.min(precoPrimeiroAno, Math.min(precoSegundoAno, precoTerceiroAno));
        double maiorValor = Math.max(precoPrimeiroAno, Math.max(precoSegundoAno, precoTerceiroAno));
        System.out.println("O menor preço desse carro foi: " + menorValor);
        System.out.println("O maior preço desse carro foi: " + maiorValor);
    }
}