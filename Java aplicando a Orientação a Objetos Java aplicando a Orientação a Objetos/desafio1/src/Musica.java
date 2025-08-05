public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double avaliacao;

    void exibeFichaTecnica() {
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);

    }
    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }
    double calcularMedia() {
        return avaliacao / numAvaliacoes;
    }
}
