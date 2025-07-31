import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Se você quiser calcular a área de um quadrado digite 1 se quiser a de um circulo digite 2.");
        int escolha = leitura.nextInt();
        if (escolha == 1) {
            System.out.println("quantos centimetros tem o lado do seu quadrado?");
            int quadrado = leitura.nextInt();
            int resultadoQuadrado = quadrado * quadrado;
            System.out.println("a área do seu quadrado é 2" + resultadoQuadrado + "cm².");
        } else {
            System.out.println("Qual o raio do seu circulo?");
            int raio = leitura.nextInt();
            double resultadoCirculo = (raio * raio) * 3.14;
            System.out.println("a área do seu circulo é " + resultadoCirculo + "cm².");
        }
    }
}