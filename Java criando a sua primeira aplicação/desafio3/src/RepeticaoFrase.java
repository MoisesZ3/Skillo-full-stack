import java.util.Scanner;

public class RepeticaoFrase {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva uma frase de sua preferencia:");
        String texto = leitura.nextLine();
        System.out.println("Diga quantas vezes quer que se repita a frase:");
        int numero = leitura.nextInt();
        while (numero > 0) {
            System.out.println(texto);
            numero--;
        }
    }
}
