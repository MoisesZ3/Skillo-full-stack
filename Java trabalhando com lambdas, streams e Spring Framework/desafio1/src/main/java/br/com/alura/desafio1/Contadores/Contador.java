package br.com.alura.desafio1.Contadores;

import java.util.Scanner;

public class Contador {

    public void contar() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um número e vamo contar até ele!");
        int numeroEscolhido = leitura.nextInt();
        for(int i = 1; i <= numeroEscolhido; i++) {
            System.out.println(i);
        }
    }
}
