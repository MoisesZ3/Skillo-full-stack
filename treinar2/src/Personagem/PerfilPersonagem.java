package Personagem;

public class PerfilPersonagem {

    private String nome;
    private String arma;
    private String classe;
    private int vida;
    private int dano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void exibirFicha() {
        System.out.println("Nome:" + nome);
        System.out.println("Arma: " + arma);
        System.out.println("Classe: " + classe);
        System.out.println("Vida:" + vida + "\n");
    }

    public void ataqueInimigo(PerfilPersonagem inimigo) {
    }
}