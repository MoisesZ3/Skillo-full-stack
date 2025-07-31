import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número para ver a sua tabuada até o 10.");
        int numero  = leitura.nextInt();
        int tabuada = 1;

        while (tabuada != 11) {
           int resultado = numero * tabuada;
           System.out.println(numero + " X " + tabuada + " = " + resultado);
           tabuada++;
        }
    }
}
