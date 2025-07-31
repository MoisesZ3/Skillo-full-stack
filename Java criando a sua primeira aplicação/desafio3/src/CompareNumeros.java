import java.util.Scanner;

public class CompareNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite dois números.");
        int numero = leitura.nextInt();
        int numero2 = leitura.nextInt();
        if (numero == numero2) {
            System.out.println("Seus números são os mesmos.");
        } else {
            if (numero > numero2) {
                System.out.println("Seus números são diferentes e o primeiro é maior.");
            } else {
                System.out.println("Seus números são diferentes e o segundo é maior.");
            }
        }

    }
}