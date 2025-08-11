import br.com.alura.desafio3.primos.GeradorPrimo;
import br.com.alura.desafio3.primos.NumerosPrimos;

import java.util.Scanner;

public class MainNumerosPrimos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        NumerosPrimos testarNumero = new NumerosPrimos();
        testarNumero.setNumero(leitura.nextInt());

        testarNumero.verificarPrimalidade();

//        GeradorPrimo testeNumero = new GeradorPrimo();
//
//        testeNumero.gerarProximoPrimo();
    }
}