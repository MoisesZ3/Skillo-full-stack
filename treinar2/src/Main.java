import Personagem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Arqueiro arqueiro = new Arqueiro();
        Ladino ladino = new Ladino();
        Mago mago = new Mago();
        Barbaro barbaro = new Barbaro();

        System.out.println("Escolha um personagem:\n1: Arqueiro\n2: Barbaro\n3: Ladino\n4: Mago");
        int escolhaPersonagem = leitura.nextInt();
        switch (escolhaPersonagem) {
            case 1:
                arqueiro.ataqueInimigo(mago);
                break;
            case 2:
                barbaro.ataqueInimigo(mago);
                break;
            case 3:
                ladino.ataqueInimigo(mago);
                break;
            case 4:
                mago.ataqueInimigo(mago);
                break;
        }
    }
}