public class Carro {
    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("O modelo do carro: " + modelo);
        System.out.println("A cor: " + cor);
        System.out.println("Ano de lançamento: " + ano);
    }
    int idadeDoCarro() {
        return 2025 - ano;
    }
}
