import java.util.Scanner;

public class SomaAteLimite {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Vamos somar alguns números, digite e informaremos quando o resultado for igual ou maior que 100.");
        int numero = leitura.nextInt();
        int resultado = numero;
        while (resultado < 100) {
            numero= leitura.nextInt();
            resultado = numero + resultado;
        }
        System.out.println("O resultado da soma foi " + resultado);
    }
}