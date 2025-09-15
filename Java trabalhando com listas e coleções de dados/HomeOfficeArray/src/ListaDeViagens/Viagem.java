package ListaDeViagens;

public class Viagem {
    private String destino;
    private int duracaoEmDias;

    public Viagem(String destino, int duracaoEmDias) {
        this.destino = destino;
        this.duracaoEmDias = duracaoEmDias;
    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }

    @Override
    public String toString() {
        return "Destino: " + destino + " Duração da viagem: " + duracaoEmDias + " dias";
    }
}
