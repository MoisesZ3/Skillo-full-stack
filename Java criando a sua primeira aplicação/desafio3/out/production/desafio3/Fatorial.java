import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int fatorial = numero - 1;

        while (fatorial != 0) {
            numero = numero * fatorial;
            fatorial--;
        }
        System.out.println(numero);
    }

}