public class MainAluno {
    public static void main(String[] args) {
        Aluno primeiroAluno = new Aluno();
        primeiroAluno.setNome("Moisés");

        primeiroAluno.calculaNotas(7.4);
        primeiroAluno.calculaNotas(8.9);
        primeiroAluno.calculaNotas(10);
        primeiroAluno.fichaALuno();
    }
}
