package Personagem;

public class Barbaro extends PerfilPersonagem{

    public Barbaro() {
        super();
        this.setNome("Steve");
        this.setArma("Machado");
        this.setClasse("Barbaro");
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
