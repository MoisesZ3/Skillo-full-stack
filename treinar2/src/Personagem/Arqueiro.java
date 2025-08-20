package Personagem;

public class Arqueiro extends PerfilPersonagem {

    public Arqueiro() {
        super();
        this.setNome("Jorel");
        this.setArma("Arco longo");
        this.setClasse("Arqueiro");
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