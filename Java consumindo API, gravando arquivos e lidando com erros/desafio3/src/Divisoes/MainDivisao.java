package Divisoes;

import java.util.Scanner;

public class MainDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos dividir alguns numeros?");
        System.out.println("Escolha o dividendo.");
        int numero1 = scanner.nextInt();
        System.out.println("Escolha o divisor.");
        int numero2 = scanner.nextInt();
        try {
            int calculo = numero1 / numero2;
            System.out.println(calculo);
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por 0!");
        }
    }
}