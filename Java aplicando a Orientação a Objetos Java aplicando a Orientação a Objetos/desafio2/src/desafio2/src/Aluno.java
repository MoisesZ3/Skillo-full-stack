public class Aluno {
    private String nome;
    private double notas;
    private double totalNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(double nota) {
        this.notas = nota;
    }

    public double getNota() {
        return notas;
    }

    void fichaALuno () {
        System.out.println(getNome());
        System.out.printf("A nota final do aluno é: %.1f", calculaMedia());
    }

    void calculaNotas(double nota) {
        notas += nota;
        totalNotas++;
    }

    double calculaMedia() {
        return notas / totalNotas;
    }
}
