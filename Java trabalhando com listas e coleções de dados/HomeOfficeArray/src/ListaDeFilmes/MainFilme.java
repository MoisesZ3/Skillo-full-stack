package ListaDeFilmes;

import java.util.ArrayList;
import java.util.List;

public class MainFilme {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Os Infiltrados","Suspense",9);
        Filme segundoFilme = new Filme("Malévola","Fantasia",6);
        List<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(primeiroFilme);
        listaDeFilmes.add(segundoFilme);

        for (Filme filme : listaDeFilmes) {
            if(filme.getAviliacao() >= 8) {
                System.out.println(filme);
            }
        }
    }
}
