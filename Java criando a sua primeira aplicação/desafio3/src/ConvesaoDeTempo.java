import java.util.Scanner;

public class ConvesaoDeTempo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero em minutos que converteremos para horas:");
        System.out.println("Digite 0 para finalizar:");
        int numero = leitura.nextInt();
        while (numero > 0) {
            int horas = numero / 60;
            double minutos = numero % 0.6;
            System.out.printf("%.2f %n", horas + minutos);
            System.out.println("horas");
            numero = leitura.nextInt();
        }
    }
}
