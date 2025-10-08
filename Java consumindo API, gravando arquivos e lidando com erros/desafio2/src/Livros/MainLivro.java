package Livros;

import com.google.gson.Gson;

public class MainLivro {
    public static void main(String[] args) {
        String json = """
                {
                  "titulo": "Grande Sertão: Veredas",
                  "autor": "João Guimarães Rosa",
                  "editora": {
                    "nome": "Nova Fronteira",
                    "local": "Rio de Janeiro"
                  }
                }
                """;
        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);

    }
}
