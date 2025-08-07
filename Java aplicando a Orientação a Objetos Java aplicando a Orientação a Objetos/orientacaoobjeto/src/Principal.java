import br.com.alura.orientacaoobjeto.modelos.Filme;
import br.com.alura.orientacaoobjeto.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O podereso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Mad Max");
        meuFilme2.setAnoDeLancamento(1980);
        meuFilme2.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        /*System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);*/
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Avaliação final: %.1f\n", meuFilme.pegaMedia());
        System.out.println("\nDuração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(5);
        meuFilme2.avalia(8);
        meuFilme2.avalia(7);
        /*System.out.println(meuFilme2.somaDasAvaliacoes);
        System.out.println(meuFilme2.totalDeAvaliacoes);*/
        System.out.println("Total de avaliações: " + meuFilme2.getTotalDeAvaliacoes());
        System.out.printf("Avaliação final: %.1f\n", meuFilme2.pegaMedia());
        System.out.println("\nDuração do filme: " + meuFilme2.getDuracaoEmMinutos());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(200);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorTemporada(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}