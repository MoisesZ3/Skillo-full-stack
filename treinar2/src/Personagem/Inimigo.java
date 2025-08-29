package Personagem;

import java.util.Random;

public class Inimigo extends PerfilPersonagem{

    private PerfilPersonagem personagemInimigo;

    public PerfilPersonagem getPersonagemInimigo() {
        return personagemInimigo;
    }

    public void setPersonagemInimigo(PerfilPersonagem personagemInimigo) {
        this.personagemInimigo = personagemInimigo;
    }

    public int gerarNumero(int minimo, int maximo) {
        Random numeroAleatorio = new Random();
        return numeroAleatorio.nextInt(maximo - minimo + 1) + minimo;
    }
}
