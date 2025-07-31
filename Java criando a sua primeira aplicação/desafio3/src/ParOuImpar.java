import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int resultado = numero / 2;
        System.out.println(resultado);
    }
}
