public class MainMusica {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Deserto";
        minhaMusica.artista = "Maria Marçal";
        minhaMusica.anoLancamento = 2022;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avaliar(10);
        minhaMusica.avaliar(5);
        minhaMusica.avaliar(7);
        minhaMusica.avaliar(3);
        minhaMusica.avaliar(2);
        System.out.printf("Avaliação: %.1f", minhaMusica.calcularMedia());
    }
}
