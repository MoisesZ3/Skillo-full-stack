import Personagem.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        Arqueiro arqueiro = new Arqueiro();
        Ladino ladino = new Ladino();
        Mago mago = new Mago();
        Barbaro barbaro = new Barbaro();
        System.out.println("Escolha um personagem:\n1: Arqueiro\n2: Barbaro\n3: Ladino\n4: Mago");

        int escolherPersonagem = leitura.nextInt();
        int escolherInimigo = numeroAleatorio.nextInt(1,4 + 1);
        int acao;
        PerfilPersonagem inimigo = null;
        switch (escolherInimigo) {
            case 1:
                inimigo = arqueiro;
            case 2:
                inimigo = ladino;
            case 3:
                inimigo = mago;
            case 4:
                inimigo = barbaro;
        }
        switch (escolherPersonagem) {
            case 1:
                System.out.println("Você escolheu o Arqueiro");
                System.out.println("Escolha um personagem:\n1: Atacar\n2: ######\n3: ######\n4: ######");
                acao = leitura.nextInt();
                switch (acao) {
                    case 1:
                        arqueiro.ataqueInimigo(inimigo);
                    case 2:

                    case 3:

                    case 4:

                }
            case 2:
                System.out.println("Você escolheu o Barbaro");
                System.out.println("Escolha um personagem:\n1: Atacar\n2: ######\n3: ######\n4: ######");
                acao = leitura.nextInt();
                switch (acao) {
                    case 1:
                        barbaro.ataqueInimigo(inimigo);
                    case 2:

                    case 3:

                    case 4:

                }
            case 3:
                System.out.println("Você escolheu o Ladino");
                System.out.println("Escolha um personagem:\n1: Atacar\n2: ######\n3: ######\n4: ######");
                acao = leitura.nextInt();
                switch (acao) {
                    case 1:
                        ladino.ataqueInimigo(inimigo);
                    case 2:

                    case 3:

                    case 4:

                }
            case 4:
                System.out.println("Você escolheu o Mago");
                System.out.println("Escolha um personagem:\n1: Atacar\n2: ######\n3: ######\n4: ######");
                acao = leitura.nextInt();
                switch (acao) {
                    case 1:
                        mago.ataqueInimigo(inimigo);
                    case 2:

                    case 3:

                    case 4:

                }
        }
    }
}