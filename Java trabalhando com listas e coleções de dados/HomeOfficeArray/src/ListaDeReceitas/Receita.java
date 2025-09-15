package ListaDeReceitas;

public class Receita {
    private String nome;
    private int tempoDePreparo;

    public Receita(String nome, int tempoDePreparo) {
        this.nome = nome;
        this.tempoDePreparo = tempoDePreparo;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    @Override
    public String toString() {
        return "Receita: " + nome + " Tempo de duração: " + tempoDePreparo + " Min";
    }
}
