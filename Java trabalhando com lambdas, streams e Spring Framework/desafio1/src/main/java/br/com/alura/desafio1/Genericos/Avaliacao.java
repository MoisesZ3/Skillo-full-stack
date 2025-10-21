package br.com.alura.desafio1.Genericos;

public class Avaliacao<T> {
    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }
}
