public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O podereso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        Filme meuFilme2 = new Filme();
        meuFilme2.nome = "Mad Max";
        meuFilme2.anoDeLancamento = 1980;
        meuFilme2.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.printf("%.1f\n\n", meuFilme.pegaMedia());

        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(5);
        meuFilme2.avalia(8);
        meuFilme2.avalia(7);
        System.out.println(meuFilme2.somaDasAvaliacoes);
        System.out.println(meuFilme2.totalDeAvaliacoes);
        System.out.printf("%.1f", meuFilme2.pegaMedia());

    }
}