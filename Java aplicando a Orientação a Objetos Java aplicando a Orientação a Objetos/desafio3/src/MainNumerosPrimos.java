import br.com.alura.desafio3.primos.NumerosPrimos;

public class MainNumerosPrimos {
    public static void main(String[] args) {
        NumerosPrimos testarNumero = new NumerosPrimos();
        testarNumero.setNumero(29);

        testarNumero.verificarPrimalidade();
    }
}