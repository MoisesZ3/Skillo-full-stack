package ListaDeAlunos;

public class Aluno {
    private String nome;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    public Aluno(String nome, double primeiraNota, double segundaNota, double terceiraNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
    }

    public double mediaNotas() {
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Nota final: (" + mediaNotas() + ")";
    }
}
