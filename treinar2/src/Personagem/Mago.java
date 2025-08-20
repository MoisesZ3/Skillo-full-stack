package Personagem;

public class Mago extends PerfilPersonagem{

    public Mago() {
        super();
        this.setNome("Patolino");
        this.setArma("Cajado");
        this.setClasse("Mago");
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
