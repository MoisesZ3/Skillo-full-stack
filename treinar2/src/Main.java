import Personagem.Arqueiro;
import Personagem.Barbaro;
import Personagem.Ladino;
import Personagem.Mago;

public class Main {
    public static void main(String[] args) {
        Arqueiro arqueiro = new Arqueiro();
        Ladino ladino = new Ladino();
        Mago mago = new Mago();
        Barbaro barbaro = new Barbaro();

        arqueiro.exibirFicha();
        ladino.exibirFicha();
        mago.exibirFicha();
        barbaro.exibirFicha();

        arqueiro.ataqueInimigo(mago);
        arqueiro.ataqueInimigo(mago);
        arqueiro.ataqueInimigo(barbaro);
    }
}