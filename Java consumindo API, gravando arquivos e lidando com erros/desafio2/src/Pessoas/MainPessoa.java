package Pessoas;

import com.google.gson.Gson;

public class MainPessoa {
    public static void main(String[] args) {
        String json = """
        {
        "nome" : "Moisés",
        "idade" : 20,
        "cidade" : "Porto Alegre",
        "estaVivo" : true
        }
        """;

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}