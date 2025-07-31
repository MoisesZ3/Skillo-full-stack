import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero  = leitura.nextInt();
        if (numero < 0) {
            System.out.println("Seu número é negativo.");
        } else {
            System.out.println("Seu número é positivo.");
        }
    }

}
