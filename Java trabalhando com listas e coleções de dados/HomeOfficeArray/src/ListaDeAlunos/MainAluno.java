package ListaDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class MainAluno {
    public static void main(String[] args) {
        Aluno primeiroAluno = new Aluno("Julho",7,10,8);
        Aluno segundoAluno = new Aluno("Pedro",5,5,10);
        Aluno terceiroAluno = new Aluno("Alberto",6,9,9);
        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(primeiroAluno);
        listaDeAlunos.add(segundoAluno);
        listaDeAlunos.add(terceiroAluno);

        for (Aluno aluno : listaDeAlunos) {
            if(aluno.mediaNotas() >= 7) {
                System.out.println("Aluno Aprovado" + aluno);
            }
        }
    }
}

