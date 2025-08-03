import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        System.out.println("Digite sua senha de 6 números.");
        Scanner leitura = new Scanner(System.in);
        String senhaCorreta = "123456";
        System.out.println(senhaCorreta);
        String senha = leitura.next();
        while (!senha.equals(senhaCorreta)) {
            System.out.println("Sua senha esta incorreta, tente novamente.");
            senha = leitura.next();
        }
        System.out.println("Sua senha esta correta, seja bem vindo!");
    }
}
