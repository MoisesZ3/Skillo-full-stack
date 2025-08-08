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

    public void exibirMenorPreco () {
        if (precoPrimeiroAno < precoSegundoAno) {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoPrimeiroAno);
        } else if (precoSegundoAno < precoTerceiroAno) {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoSegundoAno);

        } else {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoTerceiroAno);
        }
    }

    public void exibirMaiorPreco () {
        if (precoPrimeiroAno > precoSegundoAno) {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoPrimeiroAno);
        } else if (precoSegundoAno > precoTerceiroAno) {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoSegundoAno);

        } else {
            System.out.printf("O menor preço foi de: R$ %.3f\n", precoTerceiroAno);
        }
    }
}
