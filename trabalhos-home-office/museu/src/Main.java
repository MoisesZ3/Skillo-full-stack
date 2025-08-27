import Pessoas.Visitante;
import Salas.SalaFundadores;
import Salas.SalaCuriosidades;
import Salas.SalaVersoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Visitante visitante = new Visitante();
        visitante.setNome("Moisés");
        SalaFundadores salaFundadores = new SalaFundadores();
        salaFundadores.setNome("sala dos fundadores");
        salaFundadores.setDescricao("sala onde iremos mostra um pouco soubre os fundadores do Java");
        SalaCuriosidades salaCuriosidades = new SalaCuriosidades();
        salaCuriosidades.setNome("sala das curiosidades");
        salaCuriosidades.setDescricao("sala onde iremos mostra alguma curiosidades sobre Java");
        SalaVersoes salaVersoes = new SalaVersoes();
        salaVersoes.setNome("sala dos versões");
        salaVersoes.setDescricao("sala onde iremos mostra algumas versões de Java e algo novo que trouxeram");

        int escolherSala = 0;

        System.out.println("Olha " + visitante.getNome());
        System.out.println("hoje iremos te mostra um pouco do Museu da programação");
        System.out.println("vamos aqui ver um pouquinho de Java.\n");

        while(escolherSala != 4) {
            System.out.println("""
                Qual sala você quer ver agora;
                1 - Sala dos fundadores.
                2 - Sala da curiosidades.
                3 - Sala sobre as versões.
                4 - Acabar visita.
                """);
            escolherSala = leitura.nextInt();

            switch (escolherSala) {
                case 1 -> visitante.explorarSala(salaFundadores);
                case 2 -> visitante.explorarSala(salaCuriosidades);
                case 3 -> visitante.explorarSala(salaVersoes);
            }
        }
        System.out.println("Tenha um bom dia!");
    }
}