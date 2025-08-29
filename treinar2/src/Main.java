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
        System.out.println("Escolha um personagem:\n1: Arqueiro\n2: Ladino\n3: Mago\n4: Barbaro");

        int escolherPersonagem = leitura.nextInt();
        int acao;
        int escolherInimigo = numeroAleatorio.nextInt(1,4 + 1);
        PerfilPersonagem inimigo = null;
        PerfilPersonagem personagem = null;

        if(escolherPersonagem == escolherInimigo) {
            escolherInimigo = numeroAleatorio.nextInt(1,4 + 1);
        }

        switch (escolherInimigo) {
            case 1 -> inimigo = arqueiro;
            case 2 -> inimigo = ladino;
            case 3 -> inimigo = mago;
            case 4 -> inimigo = barbaro;
        }

        switch (escolherPersonagem) {
            case 1 -> personagem = arqueiro;
            case 2 -> personagem = ladino;
            case 3 -> personagem = mago;
            case 4 -> personagem = barbaro;
        }

        System.out.println("Seu personagem é " + personagem.getClasse() + "\n");
        System.out.println("Seu inimigo é " + inimigo.getClasse() + "\n");

        do {
            System.out.println("Precione 1 para rolar os ataques");
            acao = leitura.nextInt();
            switch (acao) {
                case 1 -> personagem.ataqueInimigo(inimigo);
            }
        } while(personagem.getVida() != 0 && inimigo.getVida() != 0);

        if (personagem.getVida() == 0) {
            System.out.println("Você foi derrotado!");
        }else if (inimigo.getVida() == 0) {
            System.out.println("Você venceu seu oponente!");
        }
    }
}