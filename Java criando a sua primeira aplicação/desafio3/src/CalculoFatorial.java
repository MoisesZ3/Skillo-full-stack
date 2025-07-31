import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int fatorial = numero - 1;
        int resultado;

        while (fatorial != 0) {
            resultado = numero * fatorial;
            fatorial--;
        }
    }
}


