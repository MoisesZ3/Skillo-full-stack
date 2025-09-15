package ListaDeAnimais;

public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " especie: " + especie;
    }
}
