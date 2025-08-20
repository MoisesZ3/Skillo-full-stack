package Personagem;

public class Ladino extends PerfilPersonagem{

    public Ladino() {
        super();
        this.setNome("Julho");
        this.setArma("Adaga");
        this.setClasse("Ladino");
        this.setVida(50);
        this.setDano(10);
    }

    @Override
    public void ataqueInimigo(PerfilPersonagem inimigo) {
        System.out.printf("%s ataca: \n", getClasse());
        inimigo.setVida(inimigo.getVida() - getDano() );
        System.out.printf("Vida atual do %s: %s \n", inimigo.getClasse(), inimigo.getVida());
    }
}