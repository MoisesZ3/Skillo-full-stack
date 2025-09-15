package ListaDeCarros;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " Cor: " + cor + " ano: (" + ano + ")";
    }
}
