package br.com.alura.desafio1.Genericos;

public class Avaliacao<T> {
    private T item;
    private double nota;
    private String comentario;

    public Avaliacao(T item, double nota, String comentario) {
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }
}
