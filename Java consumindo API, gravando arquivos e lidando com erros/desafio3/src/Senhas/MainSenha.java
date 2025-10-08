package Senhas;

import Senhas.Excecoes.SenhaInvalidaException;

import java.util.Scanner;

public class MainSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agora vamos criar sua senha de acesso.");
        System.out.println("Sua senha dever ter no minimo 5 caracteres e no maximo 10");
        String senha = scanner.nextLine();

        try {
            if(senha.length() < 5 || senha.length() > 10) {
                throw new SenhaInvalidaException("Sua senha não cumpriu o requisito.");
            }
            System.out.println("Sua senha esta valida\nseja bem vindo!");
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}
