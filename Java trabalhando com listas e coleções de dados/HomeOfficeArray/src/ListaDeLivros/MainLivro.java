package ListaDeLivros;

import java.util.ArrayList;
import java.util.List;

public class MainLivro {
    public static void main(String[] args) {
        Livro primeiroLivro  = new Livro("Frank Herbert","Duna",1965);
        Livro segundoLivro  = new Livro("Octavia Butler","Kindred: Laços de Sangue",1979);
        Livro terceiroLivro  = new Livro("Andy Weir","Perdido em Marte (The Martian)",	2015);
        Livro quartoLivro  = new Livro("John Scalzi","Guerra do Velho (Old Man’s War)",	2016);
        List<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(primeiroLivro);
        listaDeLivros.add(segundoLivro);
        listaDeLivros.add(terceiroLivro);
        listaDeLivros.add(quartoLivro);

        System.out.println(listaDeLivros);

        for (Livro livro : listaDeLivros) {
            if(livro.getAnoDePublicao() >= 2010) {
                System.out.println(livro);
            }
        }
    }
}
